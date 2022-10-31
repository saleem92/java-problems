package com.common;


import java.io.*;
import java.util.*;

public class ContainsAnagram {
    // Function to check if string s2
    // contains anagram of the string
    // s1 as its substring
    public static boolean checkAnagram(String s1, String s2) {

        // Stores frequencies of
        // characters in substrings of s2
        int s2hash[] = new int[26];

        // Stores frequencies of
        // characters in s1
        int s1hash[] = new int[26];
        int s1len = s1.length();
        int s2len = s2.length();

        // If length of s2 exceeds length of s1
        if (s1len > s2len)
            return false;
        int left = 0, right = 0;

        // Store frequencies of characters in first
        // substring of length s1len in string s2
        while (right < s1len) {
            s1hash[s1.charAt(right) - 'a'] += 1;
            s2hash[s2.charAt(right) - 'a'] += 1;
            right++;
        }

        right -= 1;

        // Perform Sliding Window technique
        while (right < s2len) {

            // If hashmaps are found to be
            // identical for any substring
            if (Arrays.equals(s1hash, s2hash))
                return true;

            right++;

            if (right != s2len)
                s2hash[s2.charAt(right) - 'a'] += 1;

            s2hash[s2.charAt(left) - 'a'] -= 1;
            left++;
        }
        return false;
    }

    // Driver Code
    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "bbpobac";

        if (checkAnagram(s1, s2))
            System.out.println("YES");
        else
            System.out.println("No");
    }
}
