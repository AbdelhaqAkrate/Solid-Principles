package org.example.DependencyInversion;

public class Add implements CalculatorInterface {
    @Override
    public double calcul(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.calcul(2, 3));
    }
}

