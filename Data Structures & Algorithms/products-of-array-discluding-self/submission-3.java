class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zero = 0;
        for(int i : nums) {
            if(i != 0) {
                prod *= i;
            } else {
                zero++;
            }
        }
        int[] res = new int[nums.length];
        if(zero > 1) return res;
        for(int i = 0; i < nums.length; i++) {
            if(zero == 1) {
                if(nums[i] != 0) {
                    continue;
                } else {
                    res[i] = prod;
                }
            } else if(zero == 1 && nums[i] == 0) {
                res[i] = prod;
                break;
            }
            if(zero == 0) {
                System.out.println(res[i]);
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
