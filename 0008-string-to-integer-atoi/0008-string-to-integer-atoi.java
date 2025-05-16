class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        while(i<s.length() && s.charAt(i)==' ') {
            i++;
        }

        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')) {
            sign = (s.charAt(i)=='-') ? -1: 1;
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i)-'0';

            if(result>(Integer.MAX_VALUE-digit)/10) {
                result = (sign==-1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
                return result;
            }

            result = result*10+digit;
            i++;
        }

        if(sign == -1) {
            result = -result;
        }

        return result;
    }
}