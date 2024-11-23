package calculator;

public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }

    public double negate(double num) {
        return -num;
    }
}