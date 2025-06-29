class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        long total = 0;

        for(int n : nums) {
            if(n==0) {
                count++;
                total+=count;
            }else {
                count=0;
            }
        }

        return total;
    }
}