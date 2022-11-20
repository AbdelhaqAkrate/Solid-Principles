package org.example.LiskovSubstitution;

public class Liskov {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12,34);
        System.out.println(r.getArea());
        Rectangle s = new Square(12);
        System.out.println(s.getArea());
    }
}
