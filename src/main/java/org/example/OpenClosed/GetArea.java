package org.example.OpenClosed;

public class GetArea {
    //normal way
    // public double getRectangleArea(Rectangle r){
    //     return r.getL() * r.getW();
    // }
    // public double getCircleArea(Circle c){
    //     return Math.PI * c.getRadius() * c.getRadius();
    // }
    //ocp way
    public double getArea(Shape s){
        return s.getArea();
    }
    public static void main(String[] args) {
        GetArea ga = new GetArea();
        //normal way
        // Rectangle r = new Rectangle(12, 34);
        // Circle c = new Circle(12);
        // System.out.println(ga.getRectangleArea(r));
        // System.out.println(ga.getCircleArea(c));
        //ocp way
        Rectangle r = new Rectangle(12, 34);
        Circle c = new Circle(12);
        System.out.println(ga.getArea(r));
        System.out.println(ga.getArea(c));

    }
}
