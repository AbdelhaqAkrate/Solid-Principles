package org.example.DependencyInversion;

public class Multiple implements CalculatorInterface {
    @Override
    public double calcul(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        System.out.println(multiple.calcul(2, 3));
    }
}
    

