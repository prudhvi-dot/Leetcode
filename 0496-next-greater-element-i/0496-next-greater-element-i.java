class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[nums1.length];

        

        for(int i = nums1.length-1; i>=0; i--) {
            int j = nums2.length-1;
            while(j>=0 && nums2[j]!=nums1[i]) {
                stack.push(nums2[j]);
                j--;
            }

            while(!stack.isEmpty() && stack.peek()<=nums1[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = stack.pop();
            }

            
        }

        return ans;
    }
}