package Java_version;
/**
 * Oct 12 2022
 * Leetcode_817
 * Written by Java
 */

/**
 * 给定链表头结点 head，该链表上的每个结点都有一个 唯一的整型值 。同时给定列表 nums，该列表是上述链表中整型值的一个子集。
 * 返回列表 nums 中组件的个数，这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表 nums 中）构成的集合。
 * 
 * 简单链表模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */
import java.util.*;

public class leetcode817 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int numComponents(ListNode head, int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        while (head != null) {
            if (set.contains(head.val)) {
                while (head != null && set.contains(head.val)) head = head.next;
                res++;
            }
            else {
                head = head.next;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(0);
        ListNode dummy = test;
        for (int i = 1; i < 4; i++) {
            test.next = new ListNode(i);
            test = test.next;
        }
        int[] testNums = new int[] {0,1,3};
        int res = numComponents(dummy, testNums);
        System.out.println(res); //2
    }
}
