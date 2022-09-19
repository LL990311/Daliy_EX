/**
 * Sep 19 2022
 * Leetcode_12
 * Written by Java
 */

/**
 * 整数转罗马数字
 * 模拟
 * 时间复杂度: O(1)
 * 空间复杂度: O(1)
 */
public class leetcode12 {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] values = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                sb.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 1994;
        String res = intToRoman(num); // MCMXCIV
        System.out.println(res);
    }
}
