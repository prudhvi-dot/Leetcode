class Solution {
    public int pivotIndex(int[] nums) {
        // int totalSum = 0;
        // for (int num : nums) {
        //     totalSum += num;
        // }

        // int leftSum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int rightSum = totalSum - leftSum - nums[i];
        //     if (leftSum == rightSum) {
        //         return i;
        //     }
        //     leftSum += nums[i];
        // }

        int leftSum = 0;

        for(int i = 0; i<nums.length; i++) {
            int rightSum = 0;

            if(i>0) {
                leftSum+=nums[i-1];
            }

            for(int j = i+1; j<nums.length; j++) {
                rightSum+=nums[j];
            }

            if(leftSum==rightSum) {
                return i;
            }
        }

        return -1;
    }
}
