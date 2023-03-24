package Java_version;

/**
 * Mar 24 2023
 * Leetcode2469
 * Written by Java
 * Author: ll
 */

/**
 * 给你一个四舍五入到两位小数的非负浮点数 celsius 来表示温度，以 摄氏度（Celsius）为单位。
 * 
 * 你需要将摄氏度转换为 开氏度（Kelvin）和 华氏度（Fahrenheit），并以数组 ans = [kelvin, fahrenheit]
 * 的形式返回结果。
 * 
 * 返回数组 ans 。与实际答案误差不超过 10-5 的会视为正确答案。
 * 
 * 时间 O(1)
 * 空间 O(1)
 */

public class leetcode2469 {
    public static double[] convertTemperature(double celsius) {
        return new double[] { celsius + 273.15, celsius * 1.80 + 32.00 };
    }

    public static void main(String[] args) {
        double[] res = convertTemperature(36.50);
        for (double r : res) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
}
