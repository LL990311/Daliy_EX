package Java_version;

/* 
 * 设计一个类似堆栈的数据结构，将元素推入堆栈，并从堆栈中弹出出现频率最高的元素。
 * FreqStack = new FreqStack();
 * freqStack.push (5);//堆栈为 [5]
 * freqStack.push (7);//堆栈是 [5,7]
 * freqStack.push (5);//堆栈是 [5,7,5]
 * freqStack.push (7);//堆栈是 [5,7,5,7]
 * freqStack.push (4);//堆栈是 [5,7,5,7,4]
 * freqStack.push (5);//堆栈是 [5,7,5,7,4,5]
 * freqStack.pop ();//返回 5 ，因为 5 出现频率最高。堆栈变成 [5,7,5,7,4]。
 * freqStack.pop ();//返回 7 ，因为 5 和 7 出现频率最高，但7最接近顶部。堆栈变成 [5,7,5,4]。
 * freqStack.pop ();//返回 5 ，因为 5 出现频率最高。堆栈变成 [5,7,4]。
 * freqStack.pop ();//返回 4 ，因为 4, 5 和 7 出现频率最高，但 4 是最接近顶部的。堆栈变成 [5,7]。
 */

import java.util.*;

public class leetcode895 {

    Map<Integer, Integer> cnts;
    Map<Integer, List<Integer>> map;
    int max;

    public leetcode895() {
        cnts = new HashMap<>();
        map = new HashMap<>();
        max = Integer.MIN_VALUE;
    }

    public void push(int val) {
        cnts.put(val, cnts.getOrDefault(val, 0) + 1);
        int c = cnts.get(val);
        List<Integer> list = map.getOrDefault(c, new ArrayList<>());
        list.add(val);
        map.put(c, list);
        max = Math.max(c, max);
    }

    public int pop() {
        List<Integer> list = map.get(max);
        int ans = list.remove(list.size() - 1);
        cnts.put(ans, cnts.get(ans) - 1);
        if (list.size() == 0)
            max--;
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        leetcode895 freqmap = new leetcode895();
        freqmap.push(5);
        freqmap.push(7);
        freqmap.push(5);
        freqmap.push(7);
        freqmap.push(4);
        freqmap.push(5);
        freqmap.pop();
        freqmap.pop();
        freqmap.pop();
        freqmap.pop();
    }

}
