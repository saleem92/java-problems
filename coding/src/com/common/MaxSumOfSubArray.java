package com.common;

public class MaxSumOfSubArray {

    public static void main(String[] args) {
        MaxSumOfSubArray maxSumOfSubArray = new MaxSumOfSubArray();
        int sum = maxSumOfSubArray.bruteForce(new int[]{-1, 2, 1, -3, 2, 3}, 2);

        System.out.println(sum);
    }

    private int bruteForce(int[] arr, int k) {
        int result = 0;
        for (int i = 0; i < arr.length - k - 1; i++) {
            for (int j = 0; j < k; j++) {
                result = Math.max(arr[i] + arr[i + 1], result);
            }
        }
        return result;
    }

    private int slidingWindow(int[] arr, int k) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - k - 1; i++) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                temp = i;
            }

            result = Math.max(arr[i] + arr[i - 1], arr[temp]);
        }
        return result;
    }
}
