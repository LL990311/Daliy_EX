package Java_version;

/**
 * Jan 3 2023
 * leetcode_2042
 * Written by Java
 */

/*
 * 句子是由若干 token 组成的一个列表，token 间用 单个 空格分隔，句子没有前导或尾随空格。每个 token 要么是一个由数字 0-9 组成的不含前导零的 正整数 ，要么是一个由小写英文字母组成的 单词 。
 * 示例，"a puppy has 2 eyes 4 legs" 是一个由 7 个 token 组成的句子："2" 和 "4" 是数字，其他像 "puppy" 这样的 tokens 属于单词。
 * 给你一个表示句子的字符串 s ，你需要检查 s 中的 全部 数字是否从左到右严格递增（即，除了最后一个数字，s 中的 每个 数字都严格小于它 右侧 的数字）。
 * 如果满足题目要求，返回 true ，否则，返回 false 。
 * 
 * 时间 O(n)
 */

public class leetcode2042 {
    public static boolean areNumbersAscending(String s) {
        int prev = 0, i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int cur = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    cur += cur * 10 + s.charAt(i) - '0';
                    i++;
                }
                if (cur <= prev) return false;
                prev = cur;
            }else {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles")); // true
        System.out.println(areNumbersAscending("hello world 5 x 5")); // false
    }
}
