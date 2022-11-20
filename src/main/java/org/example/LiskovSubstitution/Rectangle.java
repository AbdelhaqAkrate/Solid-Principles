package org.example.LiskovSubstitution;

public class Rectangle {
    protected double h;
    protected double w;
    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public double getArea(){
        return h * w;
    }
}
