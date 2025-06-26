class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];


        

        for(char ch : tasks) {
            arr[ch-'A']++;
        }
Arrays.sort(arr);
        int max = arr[25]-1;
        int idle = n*max;

        for(int i = 24; i>=0; i--) {
            idle -= Math.min(max, arr[i]);
        }

        return idle>0 ? tasks.length+idle : tasks.length;
    }
}