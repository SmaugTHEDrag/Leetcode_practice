class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int ans = 0;
        int sum = 0;
        for (int right = 0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                int window = right - left + 1;

                if(ans == 0 || window < ans){
                    ans = window;
                }

                sum -= nums[left];
                left++;
            }
        }
        return ans;
    }
}