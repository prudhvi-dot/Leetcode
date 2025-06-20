class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<asteroids.length; i++) {
            if(stack.isEmpty()) {
                stack.push(asteroids[i]);
                continue;
            }

            if((asteroids[i]>0 && stack.peek()>0) || (asteroids[i]<0 && stack.peek()<0)) {
                stack.push(asteroids[i]);
                continue;
            }

             boolean destroyed = false;

    while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0) {
        if (Math.abs(asteroids[i]) > Math.abs(stack.peek())) {
            stack.pop();
        } else if (Math.abs(asteroids[i]) == Math.abs(stack.peek())) {
            stack.pop();
            destroyed = true;
            break;
        } else {
            destroyed = true;
            break;
        }
    }

    if (!destroyed) {
        stack.push(asteroids[i]);
    }
        }

        int[] ans = new int[stack.size()];

        for(int i = ans.length-1; i>=0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}