class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            minHeap.add(entry);
        }

        int[] ans = new int[k];

        for(int i = 0; i<k; i++) {
            ans[i] = minHeap.poll().getKey();
        }

        return ans;
    }
}