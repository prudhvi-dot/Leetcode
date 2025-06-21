class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<num.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(num.charAt(i));
                continue;
            }

            while(!stack.isEmpty() && k>0 && num.charAt(i)<stack.peek()) {
                stack.pop();
                k--;
            }

            stack.push(num.charAt(i));
        }

        while(!stack.isEmpty() && k>0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char digit : stack) {
            sb.append(digit);
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}