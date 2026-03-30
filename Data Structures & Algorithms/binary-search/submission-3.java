class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = left + (right-left) / 2;
            int value = nums[mid];
            if(target < value) right = mid-1;
            else if(target > value) left = mid+1;
            else return mid;
        }
        return -1;
    }
}
