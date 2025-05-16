class Solution {
    public String removeOuterParentheses(String s) {
        int opened = 0;

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                if(opened>0) {
                  ans.append("(");  
                }
                opened++;
            }
            else {
                if(opened>1) {
                    ans.append(")");
                }
                opened--;
            }
        }

        return ans.toString();
    }
}