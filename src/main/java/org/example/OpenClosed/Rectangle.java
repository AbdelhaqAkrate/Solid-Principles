package org.example.OpenClosed;
//normal way
// public class Rectangle {
//     private double h;
//     private double w;
//     public Rectangle(double h, double w) {
//         this.h = h;
//         this.w = w;
//     }
//     public double getH() {
//         return h;
//     }
//     public void setH(double h) {
//         this.h = h;
//     }
//     public double getW() {
//         return w;
//     }
//     public void setW(double w) {
//         this.w = w;
//     }
  //ocp way
public class Rectangle implements Shape {
    private double h;
    private double w;
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
