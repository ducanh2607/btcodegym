import java.util.Scanner;

public class DrawMenu2 {
    static void Triangle(){
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < 6; i++){
            for (int j = 1; j <= i; j++ ){
                data.append("*");
            }
            data.append("\n");
        }
        System.out.println(data);
    }
    static void TriangleLeft(){
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < 6; i++){
            for (int j = 1; j < 6-i; j++){
                data.append(" ");
            }
            for (int k = 1; k<=i; k++){
                data.append("*");
            }
            data.append("\n");
        }
        System.out.println(data);
    }
    static void TriangleTopLeft(){
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < 6; i++){
            for (int j = 5; j >= i; j--){
                data.append("*");
            }
            data.append("\n");
        }
        System.out.println(data);
    }
    static void Square(){
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < 6; i++){
            for (int j=1; j < 6; j++){
                data.append(" * ");
            }
            data.append("\n");
        }
        System.out.println(data);
    }
     static void Rectangle(){
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < 4; i++){
            for (int j=1; j < 6; j++){
                data.append(" * ");
            }
            data.append("\n");
        }
        System.out.println(data);
    }
    static void IsoscelesTriangle(){
        StringBuilder data = new StringBuilder();
        for (int i = 0; i <=5 ; i++) {
            for (int j = i; j < 5; j++) {
                data.append(" ");
            }
            for (int k = 5-i; k < 5; k++) {
                data.append("* ");
            }
            data.append("\n");
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
        int choices = -1;
        Scanner scanner = new Scanner(System.in);
        while (choices != 0){
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Draw the left triangle");
            System.out.println("5. Draw the top left triangle");
            System.out.println("6. Exit");
            System.out.println("7.Draw the isosceles triangle");
            System.out.print("Enter your choice: ");
            choices = scanner.nextInt();
            switch (choices){
                case 1:
                    System.out.println("Draw the triangle");
                    Triangle();
                    break;
                case 2:
                    System.out.println("Draw the Square");
                    Square();
                    break;
                case 3:
                    System.out.println("Draw the Rectangle");
                    Rectangle();
                    break;
                case 6:
                    System.exit(4);
                case 4:
                    TriangleLeft();
                    break;
                case 5:
                    TriangleTopLeft();
                    break;
                case 7:
                    IsoscelesTriangle();
                    break;
                default:
                    System.out.println("No choices");
            }
        }
        }
    }

