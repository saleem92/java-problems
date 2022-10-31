package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        int index = firstUniqueCharacter.firstUniqChar("leetcode");
        System.out.println(index);
    }

    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        Map<Character, Integer> map = new HashMap<>();
        int index = -1;
        char visited = 'c';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == visited)
                continue;
            if (arr[i] != arr[i + 1]) {
                return s.indexOf(arr[i]);
            }

            visited = arr[i];
            i++;
        }

        return index;
    }

}
