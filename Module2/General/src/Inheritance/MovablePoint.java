package Inheritance;

import java.util.Arrays;

public class MovablePoint extends Point{
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;


    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arraySpeed = {this.x,this.y};
        return arraySpeed;
    }
    public float[] move(){
        this.x++;
        this.y++;
        return getSpeed();
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                ", (x,y) = " + "("+ x + "," + y + ")" +
                "speed=" + Arrays.toString(getSpeed()) +
                "speed when move: " + Arrays.toString(move())+
                '}';
    }
}
