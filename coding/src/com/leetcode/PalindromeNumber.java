package com.leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 1234567899;

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(x);

        System.out.println(isPalindrome);
    }

    private boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int result = 0;

        while (temp > 0) {
            int val = temp % 10;
            temp = temp / 10;
            result = result * 10 + val;
        }

        return x == result;
    }
}
