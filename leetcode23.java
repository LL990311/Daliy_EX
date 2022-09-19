/**
 * Sep 19 2022
 * Leetcode_23
 * Written by Java
 */

/**
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * 
 * 顺序解法，暴力
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

public class leetcode23 {

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

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoList(res, lists[i]);
        }
        return res;
    }

    public static ListNode mergeTwoList(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1); // 1 4 5
        ListNode dummy = a;
        dummy.next = new ListNode(4);
        dummy = dummy.next;
        dummy.next = new ListNode(5);

        ListNode b = new ListNode(1);// 1 3 4
        dummy = b;
        dummy.next = new ListNode(3);
        dummy = dummy.next;
        dummy.next = new ListNode(4);

        ListNode c = new ListNode(2);// 2 6
        dummy = c;
        dummy.next = new ListNode(6);

        ListNode[] test = new ListNode[]{a,b,c};
        ListNode res = mergeKLists(test);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next; //1 1 2 3 4 4 5 6
        }

    }
}
