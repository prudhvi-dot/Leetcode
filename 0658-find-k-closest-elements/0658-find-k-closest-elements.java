class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> {
            if(a[0]!=b[0]) {
                return b[0] - a[0];
            }else {
                return b[1] - a[1];
            }
        });

        for(int a : arr) {
            maxHeap.add(new int[] {Math.abs(a-x),a});

            if(maxHeap.size()>k) {
                maxHeap.poll();
            }
        }

        while(!maxHeap.isEmpty()) {
            ans.add(maxHeap.poll()[1]);
        }

        Collections.sort(ans);

        return ans;
    }
}