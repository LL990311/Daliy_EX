package Java_version;

/**
 * Dec 27 2022
 * leetcode_2027
 * Written by Java
 */

/*
 * 给你一个字符串s，由n个字符组成，每个字符不是‘X’就是‘O’
 * 
 * 一次操作定义为从s中选出三个连续字符并将选中的每个字符都转换成‘O’。
 * 注意，如果字符已经是‘O’ 只需要保持不变。
 * 
 * 返回将s中所有字符均转换成‘O’需要执行的最少操作次数
 * 
 * 时间 O(n)
 * 空间 O(1)
 */

public class leetcode2027 {
    public static int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
            }else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumMoves("XXXX")); //2
    }
}
