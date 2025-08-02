class Solution {
    public int[] twoSum(int[] nums, int target) {
            // test
            int n = nums.length;
            for(int i = 0; i < n;i++){
                for(int j = i+1; j<n;j++){
                    if(nums[i]+nums[j]==target){
                        int[] output = new int[]{i,j};
                        return output;
                    }
                }
            }
            return nums;
    }
}