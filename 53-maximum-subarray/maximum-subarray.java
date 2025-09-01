class Solution {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxSubarr = nums[0];
        for (int i = 1; i<nums.length; i++){
            maxSubarr = Math.max(maxSubarr+nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxSubarr);
        }
        return maxSum;
    }
}