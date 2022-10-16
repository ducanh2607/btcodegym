package Inheritance;

import java.sql.Array;
import java.util.Arrays;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;
    float[] arr = new float[2];

    public Point2D(){}
    public Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public Point2D(float x, float y, float[] arr) {
        this.x = x;
        this.y = y;
        this.arr = arr;
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
    public void setArr(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getArr() {
        arr = new float[]{this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
