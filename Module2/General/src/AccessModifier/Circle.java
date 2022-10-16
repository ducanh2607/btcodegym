package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){}
    Circle(double r){
        this.radius = r;
    }
    protected double getRadius(){
        return radius;
    }
    protected double getArea(){
        return Math.PI*radius*radius;
    }

}
