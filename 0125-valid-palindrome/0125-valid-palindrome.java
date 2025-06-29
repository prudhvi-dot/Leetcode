class Solution {
    public boolean isPalindrome(String s) {
        String rev = "";

        for(int i = 0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                rev += Character.toUpperCase(s.charAt(i));
            }
        }

        int i = 0;
        int j = rev.length()-1;

        while(i<j) {
            if(rev.charAt(i)!=rev.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}