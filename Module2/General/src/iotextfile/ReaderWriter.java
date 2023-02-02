package iotextfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriter {
     int countChar = 0;
    public List<String> readFile(String filePath){
        List<String> texts = new ArrayList<>();
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                texts.add(line);
                countChar += line.length();
            }
            br.close();
        }catch (Exception e){
            System.err.println("File don't exist.");
        }
        return texts;
    }
    public void writeFile(String filePath, String destination){
        try{
            FileWriter writer = new FileWriter(destination,true);
            BufferedWriter bw = new BufferedWriter(writer);
            List<String>  texts = readFile(filePath);
            for (String line : texts){
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  int getCountChar() {
        return countChar;
    }

    public static void main(String[] args) {
        ReaderWriter readerWriter = new ReaderWriter();
        readerWriter.writeFile("D:\\btcodegym\\Module2\\General\\src\\iotextfile\\departure.text", "D:\\btcodegym\\Module2\\General\\src\\iotextfile\\destination.txt");
        System.out.println(readerWriter.getCountChar());
    }
}
