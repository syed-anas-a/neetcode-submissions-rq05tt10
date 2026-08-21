class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m-1; n = n-1;
        int k = m+n+1;
        while(k >= 0) {
            if(n == -1) {
                nums1[k] = nums1[m];
                m--;
            }
            else if(m == -1) {
                nums1[k] = nums2[n];
                n--;
            }
            else if(nums2[n] >= nums1[m]) {
                nums1[k] = nums2[n];
                n--;
            }
            else{
                nums1[k] = nums1[m];
                m--;
            }
            k--;
        }
    }
}