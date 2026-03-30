class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while (left != right) {
            int num1 = numbers[left];
            int num2 = numbers[right];
            if((num1 + num2) > target) {
                right--;
            } else if((num1+num2) < target) {
                left++;
            } else {
                return new int[]{left+1, right+1};
            }
        }
        return new int[]{};
    }
}
