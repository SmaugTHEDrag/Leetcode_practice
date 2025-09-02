class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char leftIndex = s.charAt(left);
            char rightIndex = s.charAt(right);
            if(!Character.isLetterOrDigit(leftIndex)){
                left ++;
            }
            else if (!Character.isLetterOrDigit(rightIndex)){
                right --;
            }
            else if(Character.toLowerCase(leftIndex) != Character.toLowerCase(rightIndex)){
                return false;
            }
            else{
                left ++;
                right --;
            }
        } 
        return true;
    }
}