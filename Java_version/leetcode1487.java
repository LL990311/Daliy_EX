package Java_version;

import java.util.*;

/**
 * Mar 03 2022
 * Leetcode_1487
 * Written by Java
 */

/**
 * 给你一个长度为 n 的字符串数组 names 。你将会在文件系统中创建 n 个文件夹：在第 i 分钟，新建名为 names[i] 的文件夹。
 * 
 * 由于两个文件 不能 共享相同的文件名，因此如果新建文件夹使用的文件名已经被占用，系统会以 (k) 的形式为新文件夹的文件名添加后缀，其中 k
 * 是能保证文件名唯一的 最小正整数 。
 * 
 * 返回长度为 n 的字符串数组，其中 ans[i] 是创建第 i 个文件夹时系统分配给该文件夹的实际名称。
 * 
 * 哈希表
 * 时间 O(n^2)
 * 空间 O(n^2)
 */

public class leetcode1487 {
    public static String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], map.getOrDefault(names[i], 0) + 1);
            if (map.get(names[i]) == 1) {
                res[i] = names[i];
            } else {
                int c = map.get(names[i]) - 1;
                String s = addName(names[i], c);
                while (map.containsKey(s)) {
                    s = addName(names[i], ++c);
                }
                map.put(s, map.getOrDefault(s, 0) + 1);
                res[i] = s;
            }
        }
        return res;
    }

    static String addName(String name, int c) {
        return (name + "(" + c + ")");
    }
    
    public static void main(String[] args) {
        String[] res = getFolderNames(new String[] {"gta","gta(1)","gta","avalon"});
        for (String s : res) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
