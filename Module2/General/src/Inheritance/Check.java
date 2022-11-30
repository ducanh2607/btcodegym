package Inheritance;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println("---------------------");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("---------------------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        System.out.println("---------------------");
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        System.out.println("---------------------");
        Cylinder cylinder = new Cylinder(3.0);
        System.out.println(cylinder);
        System.out.println("---------------------");

        Point2D point2D = new Point2D(3.0f, 2.0f, new float[]{3.0f, 2.0f});
        System.out.println(point2D);
        System.out.println("---------------------");
        Point3D point3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D);
        System.out.println("---------------------");
        Point point = new Point(1.0f,1.0f);
        System.out.println(point);
        System.out.println("---------------------");
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        System.out.println("---------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lengths of the 3 sides of the triangle: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        double side2 = Double.parseDouble(scanner.nextLine());
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the color of the triangle: ");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(color, false, side1,side2,side3);
        System.out.println(triangle);
    }
}
