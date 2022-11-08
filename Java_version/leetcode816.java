package Java_version;
/**
 * Nov 7 2022
 * Leetcode_816
 * Written by Java
 */

/**
 * 模糊坐标
 * 我们有一些二维坐标，如 "(1, 3)" 或 "(2,
 * 0.5)"，然后我们移除所有逗号，小数点和空格，得到一个字符串S。返回所有可能的原始字符串到一个列表中。
 * 
 * 原始的坐标表示法不会存在多余的零，所以不会出现类似于"00", "0.0", "0.00", "1.0", "001",
 * "00.01"或一些其他更小的数来表示坐标。此外，一个小数点前至少存在一个数，所以也不会出现“.1”形式的数字。
 * 
 * 最后返回的列表可以是任意顺序的。而且注意返回的两个数字中间（逗号之后）都有一个空格。
 * 
 * 模拟
 * 时间复杂度: O(n^3)
 * 空间复杂度: O(n^3)
 */

import java.util.*;

public class leetcode816 {
    public List<String> ambiguousCoordinates(String s) {
        List<String> ans = new ArrayList<>();
        s = s.substring(1, s.length() - 1);
        int n = s.length();
        for (int i = 1; i < n; i++) {
            List<String> l1 = dfs(s.substring(0, i));
            List<String> l2 = dfs(s.substring(i));
            for (String a : l1) {
                for (String b : l2) {
                    ans.add("(" + a + ", " + b + ")");
                }
            }
        }
        return ans;
    }
    private List<String> dfs(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        if (n == 1 || s.charAt(0) != '0') ans.add(s); // 整数
        for (int i = 1; i < n; i++) { // 小数
            String a = s.substring(0, i), b = s.substring(i);
            if ((a.length() == 1 || s.charAt(0) != '0') && b.charAt(b.length() - 1) != '0') {
                ans.add(a + '.' + b);
            }
        }
        return ans;
    }
}
