class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            int j = 0;
            while(j < nums2.length) {
                if(nums1[i] == nums2[j]) {
                    boolean found = false;
                    while(j < nums2.length) {
                        if(nums1[i] < nums2[j]) {
                            res[i] = nums2[j];
                            found = true;
                            break;
                        }
                        j++;
                    }
                    if(!found) res[i] = -1;
                }
                j++;
            }
        }
        return res;
    }
}