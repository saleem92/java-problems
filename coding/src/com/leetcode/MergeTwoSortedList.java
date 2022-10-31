package com.leetcode;

import com.leetcode.common.ListNode;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

        ListNode head1 = new ListNode(2, null);
        ListNode h2node1 = new ListNode(2, null);
        ListNode head2 = new ListNode(1, h2node1);

        ListNode mergedListNode = mergeTwoSortedList.merge(head1, head2);

        while (mergedListNode != null) {
            System.out.println(mergedListNode.val);
            mergedListNode = mergedListNode.next;
        }

    }

    private ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null ) {
            return list2;
        }

        if (list2 == null ) {
            return list1;
        }

        if (list1.val <= list2.val) {
            list1.next = merge(list1.next, list2);
            return list1;
        } else {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }
}
