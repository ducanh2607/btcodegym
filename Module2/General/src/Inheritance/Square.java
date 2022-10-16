package Inheritance;

public class Square extends Shape{
    private double side = 1.0;
    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    public double getArea(){
        return this.side * this.side;
    }
    public double getPerimeter(){
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + getSide() +", which is a subclass of " + super.toString();
    }
}
