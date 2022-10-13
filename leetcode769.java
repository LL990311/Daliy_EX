/**
 * Oct 13 2022
 * Leetcode_769
 * Written by Java
 */

/**
 * 给定一个长度为 n 的整数数组 arr ，它表示在 [0, n - 1] 范围内的整数的排列。  
 * 我们将 arr 分割成若干 块 (即分区)，并对每个块单独排序。将它们连接起来后，使得连接的结果和按升序排序后的原数组相同。
 * 返回数组能分成的最多块数量
 * 
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

class leetcode769 {
    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length, res = 0;
        for (int i = 0, j = 0, min = n, max = -1; i < n; i++) {
            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
            if (i == max && j == min) {
                res++;
                j = i + 1;
                min = n;
                max = -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[] {1,0,2,3,4};
        int res = maxChunksToSorted(test); //4
        System.out.println(res);
    }
}