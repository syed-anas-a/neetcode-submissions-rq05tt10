class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int[] count = new int[256];
        int max = 0;
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(count[ch] == 0) {
                count[ch]++;
                max = Math.max(max, right-left+1);
                right++;
            } else {
                count[s.charAt(left)]--;
                left++;
            }
        }
        return max;
    }
}
