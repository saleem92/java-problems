package com.datastructure;

import java.util.*;
import java.util.stream.Collectors;

public class MergeSort {

    public static void main(String[] args) {
//        int[] arr = new int[]{10, 6, 8, 5, 7, 3, 4};
//        mergeSort(arr, arr.length);
//
//        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(5);

        Map<Boolean, List<Integer>> mapPartioned = list.stream()
                .collect(Collectors.partitioningBy(element -> element > 15));

        System.out.println(mapPartioned);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
