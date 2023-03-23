package Java_version;

/**
 * Mar 23 2023
 * Leetcode1011
 * Written by Java
 * Author: ll
 */

/**
 * 传送带上的包裹必须在 days 天内从一个港口运送到另一个港口。
 * 
 * 传送带上的第
 * i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量（weights）的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
 * 
 * 返回能在 days 天内将传送带上的所有包裹送达的船的最低运载能力。
 * 
 * 时间 O(nlogm)
 * 空间 O(1)
 */

public class leetcode1011 {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) >> 1;
            int cur = 0, d = 1;
            for (int w : weights) {
                if (cur + w > mid) {
                    d++;
                    cur = 0;
                }
                cur += w;
            }
            if (d <= days)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
    }
}
