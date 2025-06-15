class Solution {
    public int trap(int[] height) {
        int total = 0;

        int maxL = height[0];
        int maxR = height[height.length-1];

        int i = 0;
        int j = height.length-1;

        while(i<=j) {
            if(height[i]>maxL) {
                maxL = height[i];
            }
            if(height[j]>maxR) {
                maxR = height[j];
            }

            total+=Math.min(maxL,maxR)-Math.min(height[i],height[j]);

            if(maxR<=maxL) {
                j--;
            }
            else {
                i++;
            }
        }

        return total;
    }
}