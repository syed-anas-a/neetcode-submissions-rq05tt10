class Solution {
    public int findMin(int[] nums) {
        int max = Integer.MIN_VALUE, index = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index+1 == nums.length ? nums[0] : nums[index+1];
    }
}
