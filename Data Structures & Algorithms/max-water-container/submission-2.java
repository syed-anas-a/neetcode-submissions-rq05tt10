class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        int left = 0, right = n-1;
        while(left < right) {
            max = Math.max(max, (right-left) * (Math.min(heights[left], heights[right])));
            if(heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
