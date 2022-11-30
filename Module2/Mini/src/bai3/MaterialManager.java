package bai3;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaterialManager {
    private  ArrayList<Material> materials;
    public MaterialManager(){
        this.materials = new ArrayList<>();
    }
    public void add(int choice, Scanner scanner){
        try{
            if (choice < 1 || choice > 2){
                System.out.println("Inappropriate choice");
            }else {
                System.out.println("Enter the id: ");
                Long id = Long.parseLong(scanner.nextLine());
                System.out.println("Enter the name: ");
                String name = scanner.nextLine();
                System.out.println("Enter production date(yy-MM-dd): ");
                LocalDate date = LocalDate.parse(scanner.nextLine());
                System.out.println("Enter the cost: ");
                int cost = Integer.parseInt(scanner.nextLine());
                if (choice == 1){
                    System.out.println("Enter the weight: ");
                    double weight = Double.parseDouble(scanner.nextLine());
                    materials.add(new Meat(id, name, date, cost, weight));
                }else{
                    System.out.println("Enter the quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    materials.add(new CrispyFlour(id, name, date, cost, quantity));
                }
                writeBinaryFile();
            }
        }catch (InputMismatchException | NumberFormatException | DateTimeParseException e){
            System.out.println("The information you entered is incorrect. Please re-enter it");
        }
    }
    public void writeBinaryFile(){
        File file = new File("D:\\btcodegym\\Module2\\Mini\\src\\bai3\\infor.txt");
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(materials);
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println("Create false");
        }
    }
    public void readBinaryFile(){
        File file = new File("D:\\btcodegym\\Module2\\Mini\\src\\bai3\\infor.txt");
        ArrayList<Material> materialArrayList = new ArrayList<>();
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object object;
            if ((object = objectInputStream.readObject()) != null){
                materialArrayList = (ArrayList<Material>) object;

            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());

        }
        materials = materialArrayList;
    }
    public void displayByDiscount(){
        if(materials.isEmpty()){
            System.out.println("There are currently no products.");
        }else{
            System.out.printf("%-10s%-10s%-15s%-20s%-20s%s", "ID", "Name", "Money", "RealMoney", "Deviant", "ExpiryDate\n");
            for (Material material : materials){
                if (material instanceof Meat){
                    System.out.printf("%-10s%-10s%-15s%-20s%-20s%s", material.getId(), material.getName(), material.getAmount(), ((Meat) material).getRealMoney(),
                            (material.getAmount() - ((Meat) material).getRealMoney()), material.getExpiryDate() + "\n");
                }else {
                    System.out.printf("%-10s%-10s%-15s%-20s%-20s%s",
                            material.getId(), material.getName(), material.getAmount(),
                            ((CrispyFlour) material).getRealMoney(),
                            (material.getAmount() - ((CrispyFlour) material).getRealMoney()), material.getExpiryDate() + "\n");
                }
            }
        }
    }

    public void delete(Scanner scanner) {
        try {
            System.out.println("Enter the id of the product you want delete: ");
            Long idUpdate = Long.parseLong(scanner.nextLine());
            int index;
            if ((index = checkExist(idUpdate)) != -1) {
                materials.remove(index);
                writeBinaryFile();
            } else {
                System.out.println("The product you want to delete dóe not exists!");
            }
        } catch (NumberFormatException e) {
            System.err.println("The information you entered is incorrect. Please re-enter it!");
        }
    }

    public int checkExist(Long id) {
        for (Material m : materials) {
            if (m.getId().equals(id)) {
                return materials.indexOf(m);
            }
        }
        return -1;
    }

    public void display() {
        if (materials.isEmpty()) {
            System.out.println("There are currently no products!");
        } else {
            for (Material m : materials) {
                System.out.println(m);
            }
        }

    }

}
