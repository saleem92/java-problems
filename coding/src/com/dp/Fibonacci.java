package com.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        map.put(1, 1L);

//        long val = fibonacci.fibonacciTabulation(100, map);
        long val = fibonacci.fibonacciMomoization(100, map);
//        int val = fibonacci.fibonacci(100);

        System.out.println("value " + val);
    }

    private long fibonacciMomoization(int n, Map<Integer, Long> map) {
        if (!map.containsKey(n)) {
            map.put(n, fibonacciMomoization(n - 1, map) + fibonacciMomoization(n - 2, map));
        }

        return map.get(n);
    }

    private long fibonacciTabulation(int n, Map<Integer, Long> map) {
        for (int i = 2; i <= n; i++) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }

        return map.get(n);
    }

    private int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
