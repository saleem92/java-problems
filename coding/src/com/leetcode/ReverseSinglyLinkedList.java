package com.leetcode;

import com.leetcode.common.ListNode;

public class ReverseSinglyLinkedList {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();
        ListNode node = reverseSinglyLinkedList.reverseListRecursion(head);
        System.out.println(node.val);
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode res = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
