class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        int MOD = (int)1e9 + 7;

        // NSR: Next Smaller to Right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // NSL: Next Smaller to Left
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            long left = i - nsl[i];
            long right = nsr[i] - i;
            long contrib = (left * right) % MOD;
            contrib = (contrib * arr[i]) % MOD;
            sum = (sum + contrib) % MOD;
        }

        return (int) sum;
    }
}
