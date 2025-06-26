class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {

        if(nums.length%k!=0) return false;

        TreeMap<Integer,Integer> map = new TreeMap<>();

        int total = 0;

        for(int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        while(!map.isEmpty()) {
            int val = map.firstKey();

            int count = 0;

            while(map.containsKey(val) && count<k) {
                count++;
                map.put(val,map.get(val)-1);

                if(map.get(val)==0) {
                    map.remove(val);
                }
                val++;
            }

            if(count==k) {
                total++;
            }
        }

        return total==(nums.length/k);
    }
}