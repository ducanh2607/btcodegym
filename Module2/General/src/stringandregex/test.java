package stringandregex;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String x = "user@fpt.edu";
        String y = "\\w+@\\w+(\\.\\w+){1,2}";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }
    }
}
