class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int maxPrefix = Math.min(firstString.length(), lastString.length());
        int i = 0;
        while(i<maxPrefix && firstString.charAt(i)==lastString.charAt(i)){
            i++;
        }
        return firstString.substring(0,i);
    }
}