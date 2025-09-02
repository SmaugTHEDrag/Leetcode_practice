class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        // remove all non-alphanumeric character and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(leftChar != rightChar){
                return false;
            }
            left++;
            right--;
        } 
        return true;
    }
}