import java.util.*;

class leetcode901 {
    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        spanner.next(100); //1
        spanner.next(80);  //1
        spanner.next(60);  //1
        spanner.next(70);  //2
        spanner.next(60);  //1
        spanner.next(75);  //4
        spanner.next(85);  //6

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