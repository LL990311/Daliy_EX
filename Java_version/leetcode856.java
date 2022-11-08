package Java_version;

/**
 * Oct 09 2022
 * Leetcode_856
 * Written by Java
 */

/**
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * () 得 1 分。
 * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
 * 
 * 栈应用
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

import java.util.*;

public class leetcode856 {
    public static int scoreOfParentheses(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        for (char c : s.toCharArray()) {
            if (c == '(')
                deque.addLast(0);
            else {
                int cur = deque.pollLast();
                deque.add(deque.pollLast() + Math.max(cur * 2, 1));
            }
        }
        return deque.peekLast();
    }

    public static void main(String[] args) {
        String test = "(()(()))";
        int res = scoreOfParentheses(test);
        System.out.println(res); // 6
    }
}
