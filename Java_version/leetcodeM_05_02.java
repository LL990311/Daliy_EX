package Java_version;

/**
 * Mar 02 2023
 * Leetcode_M_05_02
 * Written by Java
 */

/**
 * 二进制数转字符串。给定一个介于0和1之间的实数（如0.72），
 * 类型为double，打印它的二进制表达式。
 * 如果该数字无法精确地用32位以内的二进制表示，则打印“ERROR”。
 * 
 * 数学
 * 时间 O(n)
 * 空间 O(n)
 */

public class leetcodeM_05_02 {

    public static String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        for (int i = 0; i < 32 && num != 0; i++) {
            num *= 2;
            int digit = (int) num;
            sb.append(digit);
            num -= digit;
        }
        return sb.toString().length() <= 32 ? sb.toString() : "ERROR";
    }

    public static void main(String[] args) {
        System.out.println(printBin(0.625)); // 0.101
    }
}
