class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int idx = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                idx++;
            }
        }
        if(idx>0) return true;
        else return false;
    }
}