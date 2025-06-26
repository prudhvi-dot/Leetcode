class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {

        if (nums.length % k != 0) return false;

        HashMap<Integer,Integer> map = new HashMap<>();

        Arrays.sort(nums);

        for(int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int n : nums) {
            if (map.get(n) == 0) continue;
            for(int i = n; i<n+k; i++) {
                if(!map.containsKey(i)) {
                    return false;
                }

                map.put(i, map.get(i)-1);
            }
        }

        return true;
    }
}