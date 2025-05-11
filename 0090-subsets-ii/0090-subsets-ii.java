class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        generate(nums, 0, new ArrayList<Integer>(), res);

        return res;
    }

    void generate(int[] nums, int start, List<Integer> list, List<List<Integer>> res) {

        res.add(new ArrayList<Integer>(list));
        for(int i = start; i<nums.length; i++) {
            if(i>start && nums[i]==nums[i-1]) {
                continue;
            }

            list.add(nums[i]);
            generate(nums, i+1, list, res);
            list.remove(list.size()-1);
        }
    }
}