class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i<nums.length) {
            int actual = nums[i]-1;

            if(nums[i]<=0 || actual>=nums.length || nums[i]==nums[actual]) {
                i++;
            }else {
                int temp = nums[i];
                nums[i] = nums[actual];
                nums[actual] = temp;
            }
        }

        for(int j = 0; j<nums.length; j++) {
            if(j!=nums[j]-1) {
                return j+1;
            }
        }

        return nums.length+1;
    }
}