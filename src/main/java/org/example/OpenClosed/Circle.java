package org.example.OpenClosed;

//normal way
// public class Circle {
//     private double radius;
//     public Circle(double radius) {
//         this.radius = radius;
//     }
//     public double getRadius() {
//         return radius;
//     }
//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

   
// }
//ocp way
public class Circle implements Shape {
    private double r;
    
    public Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
}