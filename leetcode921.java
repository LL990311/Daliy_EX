/**
 * Oct 4 2022
 * Leetcode_921
 * Written by Java
 */

/**
 * 只有满足下面几点之一，括号字符串才是有效的：
 * 
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串 s ，移动N次，你就可以在字符串的任何位置插入一个括号。
 * 
 * 例如，如果 s = "()))" ，你可以插入一个开始括号为 "(()))" 或结束括号为 "())))" 。
 * 返回 为使结果字符串 s 有效而必须添加的最少括号数。
 * 
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(n) 可替换CharAt 为 O(1)
 */

public class leetcode921 {
    public static int minAddToMakeValid(String s) {
        int score = 0, res = 0;
        for (char c : s.toCharArray()) {
            score += c == ')' ? -1 : 1;
            if (score < 0) {
                score = 0;
                res++;
            }
        }
        return score + res;
    }
    
    public static void main(String[] args) {
        String test = "())";
        int res = 0;
        res = minAddToMakeValid(test);
        System.out.println(res); // 1

        test = "(((";
        res = minAddToMakeValid(test);
        System.out.println(res); // 3
    }
}
