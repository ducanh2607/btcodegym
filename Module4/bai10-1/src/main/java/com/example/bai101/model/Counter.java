package com.example.bai101.model;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int increment(){
        return count++;
    }
}
