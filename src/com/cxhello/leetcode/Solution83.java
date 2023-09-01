package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2023-09-01
 */
public class Solution83 {

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode listNode = head;
        while (listNode.next != null) {
            if (listNode.val == listNode.next.val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution83 solution83 = new Solution83();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        solution83.deleteDuplicates(listNode1);
    }

}
