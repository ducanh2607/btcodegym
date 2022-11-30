package Inheritance;

import java.util.Arrays;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;
    public Point() {
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y =y;
    }
    public float[] getXY(){
        float[] arrPoint = {this.x, this.y};
        return  arrPoint;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                ",arrPoint = " + Arrays.toString(getXY()) +
                '}';
    }
}
