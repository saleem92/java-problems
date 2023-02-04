package com.leetcode;

public class LastWordLength {
    public static void main(String[] args) {
        LastWordLength lastWordLength = new LastWordLength();
        var length =  lastWordLength.lengthOfLastWord("Hello World");
        System.out.println(length);
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean found = false;
        int index = s.length() - 1;

        while(!found && index >= 0) {
            if (length > 0 && s.charAt(index) == ' ') {
                found = true;
            }
            if (s.charAt(index) != ' ') {
                length++;
            }
            index--;
        }

        return length;
    }
}
