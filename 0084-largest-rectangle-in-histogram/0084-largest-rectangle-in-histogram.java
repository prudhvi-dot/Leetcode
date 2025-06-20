class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = n-1; i>=0; i--) {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) {
                stack.pop();
            }

            nsr[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }

        stack.clear();

        for(int i = 0; i<n; i++) {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) {
                stack.pop();
            }

            nsl[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);
        }

        int max = 0;

        for(int i = 0; i<n; i++) {
            max = Math.max(max, heights[i]*(nsr[i]-nsl[i]-1));
        }

        return max;

    }
}