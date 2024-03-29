/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy.next;
        while(curr.next != null){
            ListNode node = curr.next;
            curr.next = node.next;
            node.next = dummy.next;
            dummy.next = node;
        }
        return dummy.next;
    }
}

