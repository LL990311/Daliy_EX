public class leetcode1800 {
    public static int maxAscendingSum(int[] nums) {
        int ans = nums[0];
        for (int i = 1, cur = nums[0]; i < nums.length; i++){
            if (nums[i] > nums[i-1]) cur += nums[i];
            else cur = nums[i];
            ans = Math.max(ans, cur);
        }        
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {10,20,30,5,10,50};
        int res = maxAscendingSum(nums); // 65
        System.out.println(res);
    }
}
