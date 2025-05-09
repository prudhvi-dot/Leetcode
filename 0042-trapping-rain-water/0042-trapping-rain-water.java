class Solution {
    public int trap(int[] height) {
        int total = 0;

        int left = 0;
        int right = height.length-1;

        int maxLeft = height[left];
        int maxRight = height[right];

        while(left<=right) {
            if(height[left]<=height[right]) {
                if(height[left]>maxLeft) {
                    maxLeft = height[left];
                }
                else {
                    total += maxLeft - height[left];
                }

                left++;
            }
            else {
                if(height[right]>maxRight) {
                    maxRight = height[right];
                }
                else {
                    total += maxRight-height[right];
                }

                right--;
            }
        }

        return total;
    }
}