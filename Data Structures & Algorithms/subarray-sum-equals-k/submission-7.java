class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int x: prefixSum) {
            if(x == k) {
                res++;
            }
            if(map.containsKey(x-k)) {
                res += map.get(x-k);
            }
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        return res;
    }
}