class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        generate(candidates, 0, target, new ArrayList<Integer>(), res);

        return res;
    }

    void generate(int[] nums, int i, int target, List<Integer> list, List<List<Integer>> res) {
        if (target < 0) return;
        if(i==nums.length) {
            if(0==target){
             res.add(new ArrayList<Integer>(list));   
            }   
            return;
        }

        list.add(nums[i]);
        generate(nums, i, target-nums[i], list, res);
        list.remove(list.size()-1);
        generate(nums, i+1, target, list, res);

    }
}