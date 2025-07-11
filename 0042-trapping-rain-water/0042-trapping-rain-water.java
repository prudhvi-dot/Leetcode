class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int max = 0;
        leftMax[0] = 0;
        rightMax[n-1] = 0;

        for(int i = 0; i<n; i++) {
            leftMax[i] = max;
            max = Math.max(max,height[i]);
        }

        max = 0;

        for(int i = n-1; i>=0; i--) {
            rightMax[i] = max;
            max = Math.max(max,height[i]);
        }

        int total = 0;

        for(int i = 0; i<n; i++) {
            if(Math.min(leftMax[i],rightMax[i])-height[i] > 0) {
                total+= Math.min(leftMax[i],rightMax[i])-height[i];
            }
        }

        return total;
    }
}