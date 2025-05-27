class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;

        double max = 0;

        double sum = 0;

        for(int j = 0; j<k; j++) {
            sum+=nums[j];
        }

        max = sum/k;


        for(int j = k; j<nums.length; j++) {
            sum+=nums[j];
            sum-=nums[i];
            i++;

            max = Math.max(max, sum/k);
        }

        return max;
    }
}