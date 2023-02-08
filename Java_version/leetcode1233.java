package Java_version;

import java.util.*;

/**
 * Feb 08 2023
 * Leetcode_1233
 * Written by Java
 */

/**
 * 你是一位系统管理员，手里有一份文件夹列表 folder，你的任务是要删除该列表中的所有 子文件夹，并以 任意顺序 返回剩下的文件夹。
 * 
 * 如果文件夹 folder[i] 位于另一个文件夹 folder[j] 下，那么 folder[i] 就是 folder[j] 的 子文件夹 。
 * 
 * 文件夹的「路径」是由一个或多个按以下格式串联形成的字符串：'/' 后跟一个或者多个小写英文字母。
 * 
 * 例如，"/leetcode" 和 "/leetcode/problems" 都是有效的路径，而空字符串和 "/" 不是。
 * 
 * 模拟 + 排序
 * 时间 O(nlogn)
 * 空间 O(n)
 */

public class leetcode1233 {
    public static List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);
        res.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            StringBuilder sb = new StringBuilder(res.get(res.size() - 1)).append("/");
            if (!folder[i].startsWith(sb.toString()))
                res.add(folder[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] test = new String[] {
                "/a", "/a/b", "/c/d", "/c/d/e", "/c/f"
        };
        List<String> res = removeSubfolders(test);
        for (String s : res) {
            System.out.println(s);
        }
    }
}
