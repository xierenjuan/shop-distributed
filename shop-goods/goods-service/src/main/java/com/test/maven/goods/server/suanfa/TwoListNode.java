package com.test.maven.goods.server.suanfa;

public class TwoListNode {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l100 = new ListNode(4);
        ListNode l111 = new ListNode(3);
        l1.next = l100;
        l100.next = l111;

        ListNode l2 = new ListNode(8);
        ListNode l200 = new ListNode(5);
        ListNode l211 = new ListNode(9);
        l2.next = l200;
        l200.next = l211;

        addTwoNumbers(l1, l2);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
        }

        return root.next;
    }
}
