package com.cxhello.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cxhello
 * @date 2021/11/5
 */
public class Solution141 {

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

    public boolean hasCycle(ListNode head) {
        List<ListNode> seen = new ArrayList<>();
        while (head != null) {
            if (seen.contains(head)) {
                return true;
            }
            seen.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution141 solution141 = new Solution141();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        solution141.hasCycle(listNode1);
    }

}
