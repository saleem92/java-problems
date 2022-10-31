package com.dp;

public class Knapsack {

    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;

        Knapsack knapsack = new Knapsack();
        int solve = knapsack.solveBruteForce(W, wt, val, n);
        System.out.println("result " + solve);
    }

    private int solveBruteForce(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W)
            return solveBruteForce(W, wt, val, n - 1);

        int v1 = val[n - 1]
                + solveBruteForce(W - wt[n - 1], wt,
                val, n - 1);
        int v2 = solveBruteForce(W, wt, val, n - 1);

        return Math.max(v1, v2);
    }
}
