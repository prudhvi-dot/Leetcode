class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        generate(candidates, 0, target, 0, new ArrayList<Integer>(), res);

        return res;
    }

    void generate(int[] nums, int i, int target, int sum, List<Integer> list, List<List<Integer>> res) {

        if(sum>target) {
            return;
        }
        if(i==nums.length) {
            if(sum==target){
             res.add(new ArrayList<Integer>(list));   
            }   
            return;
        }

        list.add(nums[i]);
        generate(nums, i, target, sum+nums[i], list, res);
        list.remove(list.size()-1);
        generate(nums, i+1, target, sum, list, res);

    }
}