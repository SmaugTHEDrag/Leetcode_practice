class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int left = 0;
        int maxCount = 0;
        for(int right = 0; right<s.length(); right++){
            for(int i = left; i<right; i++){
                if(s.charAt(i) == s.charAt(right)){
                    left = i+1;
                    break;
                }
            }
            int window = right - left + 1;
            maxCount = Math.max(maxCount, window);
        }
        return maxCount++;
    }
}