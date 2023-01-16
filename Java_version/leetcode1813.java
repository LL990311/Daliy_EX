package Java_version;

/**
 * Jan 16 2023
 * leetcode_1813
 * Written by Java
 */

/*
 * 一个句子是由一些单词与它们之间的单个空格组成，且句子的开头和结尾没有多余空格。比方说，"Hello World" ，"HELLO" 
 * ，"hello world hello world" 都是句子。每个单词都 只 包含大写和小写英文字母。
 * 
 * 如果两个句子 sentence1
 * 和 sentence2 ，可以通过往其中一个句子插入一个任意的句子（可以是空句子）而得到另一个句子，那么我们称这两个句子是
 * 相似的 。比方说，sentence1 = "Hello my name is Jane" 且 sentence2 =
 * "Hello Jane" ，我们可以往 sentence2 中 "Hello" 和 "Jane" 之间插入 "my name is" 得到
 * sentence1 。
 * 
 * 给你两个句子 sentence1 和 sentence2 ，如果 sentence1 和 sentence2
 * 是相似的，请你返回 true ，否则返回 false 。
 */

/*
 * 时间 O(n + m)
 * 空间 O(n + m)
 */


public class leetcode1813 {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int i = 0, j = 0;
        while (i < s1.length && i < s2.length && s1[i].equals(s2[i])) {
            i++;
        }
        while (j < s1.length - i && j < s2.length - i && s1[s1.length - j - 1].equals(s2[s2.length - j - 1])) {
            j++;
        }
        System.out.printf("i = %d, j = %d\n", i, j);
        return i + j == Math.min(s1.length, s2.length);
    }

    public static void main(String[] args) {
        System.out.println(areSentencesSimilar("he name is bob", "he bob")); // true
    }
}
