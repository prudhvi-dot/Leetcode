class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        int total = 0;

        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(hand); 

        for(int n : hand) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int n : hand) {
            if (!map.containsKey(n)) continue;
            int count = 0;

            if(!map.containsKey(n-1)) {
                int i = n;
                while(map.containsKey(i) && count<groupSize) {
                    count++;
                    map.put(i,map.get(i)-1);
                    if(map.get(i)==0) {
                        map.remove(i);
                    }
                    i++;
                }

                if(count==groupSize) {
                    total++;
                }
            }
        }

        return total==(hand.length/groupSize);
    }
}