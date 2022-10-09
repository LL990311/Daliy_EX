import java.util.*;

public class leetcode856 {
    public static int scoreOfParentheses(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        for (char c : s.toCharArray()) {
            if (c == '(') deque.addLast(0);
            else{
                int cur = deque.pollLast();
                deque.add(deque.pollLast() + Math.max(cur * 2, 1));
            }
        }
        return deque.peekLast();
    }

    public static void main(String[] args) {
        String test = "(()(()))";
        int res = scoreOfParentheses(test);
        System.out.println(res); // 6
    }
}
