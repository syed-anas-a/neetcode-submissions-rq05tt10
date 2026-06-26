class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int maxLen = 0;
        int left = 0, right = 0;
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(!hs.contains(ch)) {
                hs.add(ch);
                int windowLength = right-left+1;
                maxLen = Math.max(maxLen, windowLength);
                right++;
            }
            else {
                while(hs.contains(ch)) {
                    hs.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return maxLen;
    }
}
