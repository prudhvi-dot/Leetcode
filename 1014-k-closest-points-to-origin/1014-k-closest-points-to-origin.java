class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<Integer,Double> map = new HashMap<>();

        for(int i = 0; i<points.length; i++) {
            map.put(i,Math.sqrt(Math.pow(points[i][0],2)+Math.pow(points[i][1],2)));
        }

        PriorityQueue<Map.Entry<Integer,Double>> pq = new PriorityQueue<>((a,b)->Double.compare(a.getValue(),b.getValue()));

        for(Map.Entry<Integer,Double> entry : map.entrySet()) {
            pq.add(entry);
        }

        int[][] ans = new int[k][];

        for(int i = 0; i<k; i++) {
           int index = pq.poll().getKey();

           ans[i] = new int[] {points[index][0], points[index][1]};
        }

        return ans;
    }
}