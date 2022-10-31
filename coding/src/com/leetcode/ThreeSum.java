package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{
            -1, 0, 1, 2, -1, -4
        });
    }

    public void threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);


                        Collections.sort(list);

                        result.add(list);
                    }
                }
            }
        }

        result = new ArrayList<>(new LinkedHashSet<>(result));
        System.out.println(result);
    }
}
