class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: prefix) {
            if(x == k) count++;
            if(map.containsKey(x-k)) {
                count += map.get(x-k);
            }
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        return count;
    }
}