class Solution {
    public String removeOuterParentheses(String s) {
        int opened = 0;

        String ans = "";

        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                if(opened>0) {
                  ans+='(';  
                }
                opened++;
            }
            else {
                if(opened>1) {
                    ans+=")";
                }
                opened--;
            }
        }

        return ans;
    }
}