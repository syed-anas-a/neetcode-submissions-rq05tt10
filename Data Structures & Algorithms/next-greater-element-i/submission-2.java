class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {

            int target = nums1[i];
            int ans = -1;

            for(int j = 0; j < nums2.length; j++) {

                if(nums2[j] == target) {

                    for(int k = j + 1; k < nums2.length; k++) {
                        if(nums2[k] > target) {
                            ans = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            res[i] = ans;
        }
        return res;
    }
}