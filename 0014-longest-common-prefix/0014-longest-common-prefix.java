class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<strs.length; i++) {
            if(strs[i].length()<min) {
                min = strs[i].length();
                common = strs[i];
            }
        }

        min = Integer.MAX_VALUE;

        for(int i = 0; i<strs.length; i++) {
            int j = 0;
            while( j< strs[i].length() && j < common.length() && strs[i].charAt(j)==common.charAt(j)) {
                j++;
            }

            min = Math.min(min,j);
            
        }

        return common.substring(0,min);
    }
}