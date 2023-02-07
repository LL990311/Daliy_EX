package Java_version;

/**
 * Feb 07 2022
 * Leetcode_1604
 * Written by Java
 */

/*
 * 力扣公司的员工都使用员工卡来开办公室的门。每当一个员工使用一次他的员工卡，安保系统会记录下员工的名字和使用时间。如果一个员工在一小时时间内使用员工卡的次数大于等于三次，这个系统会自动发布一个 警告 。
 * 给你字符串数组 keyName 和 keyTime ，其中 [keyName[i], keyTime[i]] 对应一个人的名字和他在 某一天 内使用员工卡的时间。
 * 使用时间的格式是 24小时制 ，形如 "HH:MM" ，比方说 "23:51" 和 "09:49" 。
 * 请你返回去重后的收到系统警告的员工名字，将它们按 字典序升序 排序后返回。
 * 请注意 "10:00" - "11:00" 视为一个小时时间范围内，而 "23:51" - "00:10" 不被视为一小时内，因为系统记录的是某一天内的使用情况。
 * 
 * 哈希 + 排序
 * 时间复杂度: O(nlogn)
 * 空间复杂度: O(n)
 */

import java.util.*;

public class leetcode1604 {
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> count = new HashMap<>();
        int n = keyName.length;
        for (int i = 0; i < n; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            count.putIfAbsent(name, new ArrayList<>());
            int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
            int mins = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
            count.get(name).add(hour * 60 + mins);
        }
        List<String> res = new ArrayList<>();
        Set<String> keySet = count.keySet();
        for (String name : keySet) {
            List<Integer> timestamp = count.get(name);
            Collections.sort(timestamp);
            for (int i = 2; i < timestamp.size(); i++) {
                int time1 = timestamp.get(i - 2), time2 = timestamp.get(i);
                int diff = time2 - time1;
                if (diff <= 60) {
                    res.add(name);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        String[] keyName = new String[] { "daniel", "daniel", "daniel", "luis", "luis", "luis", "luis" };
        String[] keyTime = new String[] { "10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00" };
        List<String> res = alertNames(keyName, keyTime);
        for (String s : res) {
            System.out.println(s);
        }
    }
}
