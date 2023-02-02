package iobinaryfile;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException{
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args){


        File sourceFile = new File("D:\\btcodegym\\Module2\\General\\src\\iobinaryfile\\demo.txt");
        File destFile = new File("D:\\btcodegym\\Module2\\General\\src\\iobinaryfile\\copydemo");
        try{
            copyFileUsingJava7Files(sourceFile, destFile);
        }catch (IOException ioe){
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
}
