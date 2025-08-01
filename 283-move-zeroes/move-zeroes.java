class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <=1){
            System.out.println(nums);
        }
        else {
            int count = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]!=0){
                    int swap = nums[i];
                    nums[i] = nums[count];
                    nums[count] = swap;
                    count++;    
                }
                
            }
        }
    }
}