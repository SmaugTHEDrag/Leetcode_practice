class Solution {
    public int[] plusOne(int[] digits) {
        //new
        int n = digits.length;
        for(int i = n-1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] new_number = new int[n+1];
        new_number[0]=1;
        return new_number;
    }
}