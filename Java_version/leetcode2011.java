package Java_version;

/**
 * Dec 23 2022
 * leetcode_2011
 * Written by Java
 */

/*
 * 存在一种仅支持5种操作和1个变量X的编程语言：
 *  ++X和X++是变量X加一
 *  --X和X--是变量X减一
 * 
 *  最初X的值时0
 *  给你一个字符串数组operations，这是由操作组成的一个列表，返回执行所有操作后，
 *  X的最终值
 */

class leetcode2011{
    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String s : operations) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '-') {
                    res--;
                    break;
                }else if (s.charAt(i) == '+') {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] test = new String[] {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(test)); // 1
    }
}