class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        int n = nums.length;
        int[] result = new int [n];
        while (left<=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare>rightSquare){
                result[pos] = leftSquare;
                left++;
            }
            else {
                result[pos] = rightSquare;
                right --;
            }
            pos--;
        }
        return result;
    }
}