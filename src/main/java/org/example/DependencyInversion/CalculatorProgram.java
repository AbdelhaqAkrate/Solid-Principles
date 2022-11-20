package org.example.DependencyInversion;

public class CalculatorProgram {
        private CalculatorInterface calculatorInterface;

        public CalculatorProgram(CalculatorInterface calculatorInterface)
    {
        this.calculatorInterface = calculatorInterface;
    }
    public CalculatorInterface getCalculatorInterface() {
        return calculatorInterface;
    }

    public double Calculate(double a, double b)
    {
        return calculatorInterface.calcul(a, b);
    }

    
    
}
