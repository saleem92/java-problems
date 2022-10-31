package com.leetcode;

import com.leetcode.common.ListNode;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode three = new ListNode(1, null);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(2, two);
        ListNode node = new ListNode(1, one);

        boolean isPalindrome = palindromeLinkedList.isPalindrome(node);
        System.out.println(isPalindrome);
    }

    // 1 2 2 1
    private boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverse(slow);

        while (reversed != null) {
            if (reversed.val != head.val) return false;

            reversed = reversed.next;
            head = head.next;
        }

        return true;
    }

    // 3 2 1
    public ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
