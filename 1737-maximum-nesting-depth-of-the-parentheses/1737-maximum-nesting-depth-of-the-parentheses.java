class Solution {
    public int maxDepth(String s) {
        // Stack<Character> stack = new Stack<>();

        int Max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i<s.length(); i++) {
            
            if(s.charAt(i)=='(') {
                count++;
            }
            else if(s.charAt(i)==')') {
                count--;

            }
            Max = Math.max(Max,count);
        }

        return Max;
    }
}