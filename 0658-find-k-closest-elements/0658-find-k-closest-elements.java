class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = arr.length-1;

        while(j-i+1>k) {
            if(Math.abs(arr[j]-x)>=Math.abs(arr[i]-x)) {
                j--;
            }
            else {
                i++;
            }
        }

        for(int l = i; l<=j; l++) {
            ans.add(arr[l]);
        }

        return ans;
    }
}