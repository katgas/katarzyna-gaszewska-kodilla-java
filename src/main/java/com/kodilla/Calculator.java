package com.kodilla;

public class Calculator {
    public double addAToB(double a, double b) {
        return a+b;
    }
    public double subtractAFromB(double a, double b) {
        return b-a;
    }
    public double multiplyAByB(double a, double b) {
        return a*b;
    }
    public double divideAByB(double a, double b) {
        return a/b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addition = calculator.addAToB(3,7);
        double subtraction = calculator.subtractAFromB(5,20);
        double division = calculator.divideAByB(40,5);
        double multiplication = calculator.multiplyAByB(2,18);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(division);
        System.out.println(multiplication);
    }
}
