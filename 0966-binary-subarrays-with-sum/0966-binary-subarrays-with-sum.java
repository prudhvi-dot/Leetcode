class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal==0) {
            return count(nums,goal);
        }
        return count(nums,goal)-count(nums,goal-1);
    }

    int count(int[] nums, int k) {
        int sum = k;

        int total = 0;

        int i = 0;

        for(int j = 0; j<nums.length; j++) {
            sum-=nums[j];

            while(sum<0) {
                sum+=nums[i];
                i++;
            }

            total += j-i+1;
        }

        return total;
    }
}