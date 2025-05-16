class Solution {
    public String reverseWords(String s) {
        String ans = "";

        int i = s.length()-1;

        while(i>=0) {
            while(i>=0 && s.charAt(i)==' ') {
                i--;
            }

            StringBuilder word = new StringBuilder();

            while(i>=0 && s.charAt(i)!=' ') {
                word.insert(0,s.charAt(i));
                i--;
            }

            if (!ans.isEmpty()) {
                ans += " ";
            }

            ans += word.toString();
        }

        return ans.trim();
    }
}