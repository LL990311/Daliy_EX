package Java_version;

/**
 * Mar 15 2023
 * Leetcode_24
 * Written by Java
 * Author: LukeLong
 */


/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 * 
 * 迭代
 * 时间 O(n)
 * 空间 O(1)
 * 
 * 递归
 * 时间 O(n)
 * 空间 O(1)
 */

public class leetcode24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // public static ListNode swapPairs(ListNode head) {
    //     ListNode dummy = new ListNode(0);
    //     ListNode temp = new ListNode();
    //     dummy.next = head;
    //     temp = dummy;
    //     while (temp.next != null && temp.next.next != null) {
    //         ListNode n1 = temp.next, n2 = temp.next.next;
    //         temp.next = n2;
    //         n1.next = n2.next;
    //         n2.next = n1;
    //         temp = n1;
    //     }
    //     return dummy.next;
    // }

    // recursion
    public static ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode();
        ListNode dummy = test;
        for (int i = 1; i <= 4; i++) {
            ListNode temp = new ListNode(i);
            test.next = temp;
            test = test.next;
        }
        ListNode res = swapPairs(dummy.next);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
