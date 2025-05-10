class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        generate(nums,0,new ArrayList<Integer>(), res);

        return res;

    }

    void generate(int[] nums, int i, List<Integer> list, List<List<Integer>> res) {
        if(i==nums.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }

        list.add(nums[i]);
        generate(nums, i+1, list, res);
        list.remove(list.size()-1);
        generate(nums, i+1, list, res);
    }
}