package com.revature.java;

public class LambdaExp {
    public static float calculate(float num1, float num2, String operator) {
        Operation operation = null;

        switch (operator) {
            case "+":
                operation = (a, b) -> a + b;
                break;
            case "-":
                operation = (a, b) -> a - b;
                break;
            case "*":
                operation = (a, b) -> a * b;
                break;
            default:
                System.out.println("Invalid Operator");
        }

        return operation.inputs(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(calculate(20, 5, "+"));
        System.out.println(calculate(50, 15, "-"));
        System.out.println(calculate(2, 5, "*"));
    }
}
