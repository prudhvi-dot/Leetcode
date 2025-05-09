class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return solve(nums,k)-solve(nums,k-1);
    }

    int solve(int[] nums, int k) {
        int total = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 0;

        for(int j = 0; j<nums.length; j++) {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.size()>k) {
                map.put(nums[i],map.get(nums[i])-1);

                if(map.get(nums[i])==0) {
                    map.remove(nums[i]);
                }

                i++;
            }


            total += j-i+1;
        }

        return total;
    }
}