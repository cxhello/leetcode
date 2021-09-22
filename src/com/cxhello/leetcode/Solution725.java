package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/9/22
 */
public class Solution725 {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode listNode = head;
        while (listNode != null) {
            listNode = listNode.next;
            length++;
        }
        ListNode[] nodes = new ListNode[k];
        if (length <= k) {
            for (int i = 0; i < k; i++) {
                if (head != null) {
                    nodes[i] = new ListNode(head.val);
                    head = head.next;
                } else {
                    nodes[i] = null;
                }
            }
        } else {
            int n = length / k;
            int m = length % k;
            ListNode result = head;
            for (int i = 0; i < k; i++) {
                nodes[i] = result;
                ListNode temp = result;
                for (int j = 1; j < n + (m > 0 ? 1 : 0); j++) {
                    temp = temp.next;
                }
                result = temp.next;
                // 截断
                temp.next = null;
                m--;
            }
        }
        return nodes;
    }

    static class ListNode {
        int val;

        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        Solution725 solution725 = new Solution725();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        solution725.splitListToParts(listNode, 5);
    }

}
