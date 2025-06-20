class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nsr = new int[nums.length];
        int[] nsl = new int[nums.length];

        // Calculate NSR (Next Smaller to Right)
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? nums.length : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Calculate NSL (Next Smaller to Left)
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        long Minsum = 0;

        for (int i = 0; i < nums.length; i++) {
            long left = i - nsl[i];
            long right = nsr[i] - i;
            long contrib = left * right * nums[i];
            Minsum += contrib;
        }

        stack.clear();

        int[] ngr = new int[nums.length];
        int[] ngl = new int[nums.length];

        // Calculate NGR (Next Greater to Right)
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            ngr[i] = stack.isEmpty() ? nums.length : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Calculate NGL (Next Greater to Left)
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            ngl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        long Maxsum = 0;

        for (int i = 0; i < nums.length; i++) {
            long left = i - ngl[i];
            long right = ngr[i] - i;
            long contrib = left * right * nums[i];
            Maxsum += contrib;
        }

        return Maxsum - Minsum;
    }
}
