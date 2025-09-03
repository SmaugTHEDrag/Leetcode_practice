class Solution {

    public int maxVowels(String s, int k) {
        int left = 0;
            int vowel = 0;
            for(int i = 0; i < k; i++){
                if("aeiou".indexOf(s.charAt(i)) != -1){
                    vowel++;
                }
            }
            int maxVowel = vowel;
            for(int right = k; right<s.length(); right++){
                if("aeiou".indexOf(s.charAt(left)) != -1){
                    vowel--;
                }
                left++;
                if("aeiou".indexOf(s.charAt(right)) != -1){
                    vowel++;
                }
                maxVowel = Math.max(maxVowel, vowel);
            }
            return maxVowel;
    }
}