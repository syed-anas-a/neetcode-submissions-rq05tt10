class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subsets = new ArrayList<>();
        List<List<Integer>> allSubsets = new ArrayList<>();
        getAllSubsets(nums, 0, subsets, allSubsets);
        return allSubsets;
    }
    public void getAllSubsets(
            int[] nums, int i, List<Integer> subsets, 
            List<List<Integer>> allSubsets
        ) 
    {
        if(i == nums.length) {
            allSubsets.add(new ArrayList<>(subsets));
            return;
        }
        subsets.add(nums[i]);
        getAllSubsets(nums, i+1, subsets, allSubsets);
        subsets.remove(subsets.size()-1);
        getAllSubsets(nums, i+1, subsets, allSubsets);
    }
}
