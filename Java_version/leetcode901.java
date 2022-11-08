package Java_version;
/**
 * Oct 21 2022
 * Leetcode_901
 * Written by Java
 */

/**
 * 股票价格跨度
 * 编写一个 StockSpanner 类，它收集某些股票的每日报价，并返回该股票当日价格的跨度。
 * 
 * 今天股票价格的跨度被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）
 * 例如，如果未来7天股票的价格是 [100, 80, 60, 70, 60, 75, 85]，那么股票跨度将是 [1, 1, 1, 2, 1, 4, 6]。
 * 
 * 单调栈
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

import java.util.*;

class leetcode901 {
    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        spanner.next(100); // 1
        spanner.next(80); // 1
        spanner.next(60); // 1
        spanner.next(70); // 2
        spanner.next(60); // 1
        spanner.next(75); // 4
        spanner.next(85); // 6

    }
}

class StockSpanner {

    static Deque<int[]> deque;
    static int cur;

    public StockSpanner() {
        deque = new ArrayDeque<>();
        cur = 0;
    }

    public void next(int price) {
        while (!deque.isEmpty() && deque.peekLast()[1] <= price)
            deque.pollLast();
        int prev = deque.isEmpty() ? -1 : deque.peekLast()[0], ans = cur - prev;
        deque.addLast(new int[] { cur++, price });
        System.out.println(ans);
    }
}