class Solution {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length - 2;
        int trap = 0;

        int leftMax = height[left - 1];
        int rightMax = height[right+1];
        while(left<=right){
            if(leftMax <= rightMax){
                trap += Math.max(0, leftMax - height[left]);
                leftMax = Math.max(leftMax, height[left]);
                left++;
            }
            else{
                trap += Math.max(0, rightMax - height[right]);
                rightMax = Math.max(rightMax, height[right]);
                right --;
            }
        }
        return trap;
    }
}