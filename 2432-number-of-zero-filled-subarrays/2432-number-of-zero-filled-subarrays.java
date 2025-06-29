class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int index = -1;

        long total = 0;

        for(int i = 0; i<nums.length; i++) {
            if(index==-1 && nums[i]==0) {
                index = i;
            }
            else if(nums[i]!=0) {
                index = -1;
            }
            
            if(nums[i]==0) {
                total += i-index+1;
            }
        }

        return total;
    }
}