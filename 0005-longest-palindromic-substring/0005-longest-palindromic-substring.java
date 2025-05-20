class Solution {
    public String longestPalindrome(String s) {
        int max = 1;

        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i<s.length(); i++) {
            for(int j = i; j<s.length(); j++) {
                if(isPalindrome(s.substring(i,j+1))) {
                    if(j-i+1 > index2-index1+1) {
                        index1 = i;
                        index2 = j;
                    }
                }
            }
        }

        return s.substring(index1,index2+1);
    }

    boolean isPalindrome(String str) {
        int i = 0;

        int j = str.length()-1;

        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}