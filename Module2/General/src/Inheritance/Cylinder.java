package Inheritance;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height * Math.PI * getRadius() * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() + "with volume = " + getVolume() + ", which is a subclass of " + super.toString() +
                '}';
    }
}
