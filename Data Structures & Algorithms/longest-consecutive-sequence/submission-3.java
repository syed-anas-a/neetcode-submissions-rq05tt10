class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int x: nums) {
            set.add(x);
        }
       int max = 1, len = 1;
       for(int x: nums) {
            if(!set.contains(x-1)) {
                int start = x;
                len = 1;
                while(set.contains(start+len)) {
                    len += 1;
                }
                max = Math.max(max, len);
            }
       }

        return max;
    }
}
