package iotextfile;

import java.io.*;
import java.util.Scanner;

public class ReadFIleExample {
  public static void readFileText(String filePath){
      try{
          File file = new File(filePath);
          if (!file.exists()) {
              throw new FileNotFoundException();
          }

          // Đọc từng dòng của file và tiến hành cộng tổng lại
          BufferedReader br = new BufferedReader(new FileReader(file));
          String line = "";
          int sum = 0;
          while ((line = br.readLine()) != null){
              System.out.println(line);
              sum += Integer.parseInt(line);
          }
          br.close();
          System.out.println("Sum " + sum);

      }catch (Exception e){
          System.out.println("File don't exit");
      }
  }

    public static void main(String[] args) {
        System.out.println("Enter file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        readFileText(path);
    }
}
