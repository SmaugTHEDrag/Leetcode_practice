class Solution {
    public boolean isPalindrome(int x) {
        // get str 
        String str = Integer.toString(x);
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)){
            return true;
        }
        return false;
    }
}