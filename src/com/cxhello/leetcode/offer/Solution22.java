package com.cxhello.leetcode.offer;

/**
 * @author cxhello
 * @date 2021/9/2
 */
public class Solution22 {

    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode listNode = head.next;
        int index = 1;
        while (listNode != null) {
            index += 1;
            listNode = listNode.next;
        }
        int flag = index - k;
        if (flag == 0) {
            return head;
        }
        listNode = head.next;
        int a = 1;
        while (listNode != null) {
            if (a == flag) {
                return listNode;
            }
            a += 1;
            listNode = listNode.next;
        }
        return head;
    }

    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            k--;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4);
        listNode4.next = listNode5;
        ListNode listNode3 = new ListNode(3);
        listNode3.next = listNode4;
        ListNode listNode2 = new ListNode(2);
        listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(1);
        listNode1.next = listNode2;
        solution22.getKthFromEnd(listNode1, 2);
        solution22.getKthFromEnd2(listNode1, 2);
    }

}
