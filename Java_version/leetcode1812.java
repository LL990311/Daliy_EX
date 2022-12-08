package Java_version;

/**
 * Dec 8 2022
 * leetcode_1812
 * Written by Java
 */

/*
 * 给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标
 * 如果所给格子的颜色是白色，请你返回 true，如果是黑色，请返回 false 。
 * 给定坐标一定代表国际象棋棋盘上一个存在的格子。坐标第一个字符是字母，第二个字符是数字。
 */

public class leetcode1812 {
    public static boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a3"));
    }
}