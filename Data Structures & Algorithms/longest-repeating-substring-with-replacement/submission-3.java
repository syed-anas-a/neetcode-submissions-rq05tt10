class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxLen = 0, maxFreq = 0;
        int[] freq = new int[26];
        while(right < s.length()) {
            char ch = s.charAt(right);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);
            if(right-left+1 - maxFreq <= k) {
                maxLen = Math.max(maxLen, right-left+1);
            }
            else {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return maxLen;
    }
}
