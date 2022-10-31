package com.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int val = fibonacci(8);

        System.out.println("value " + val);
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
