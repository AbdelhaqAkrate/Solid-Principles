package org.example.DependencyInversion;

public class Operation {
    private CalculatorInterface calculatorInterface;
    public void Add()
    {
        CalculatorProgram calculatorProgram = new CalculatorProgram(new Add());
        System.out.println(calculatorProgram.Calculate(2, 3));
    }
    public void Multiple()
    {
        CalculatorProgram calculatorProgram = new CalculatorProgram(new Multiple());
        System.out.println(calculatorProgram.Calculate(2, 3));
    }
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.Add();
        operation.Multiple();
    }
}
