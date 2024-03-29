package iobinaryfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readToFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
    }catch (Exception e){
            e.printStackTrace();
        }
        return students;
}

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hòa", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("D:\\btcodegym\\Module2\\General\\src\\iobinaryfile\\student.txt", students);
        List<Student> listStudent = readToFile("src/iobinaryfile/student.txt");
        for (Student student : students){
            System.out.println(student);
        }
    }}

