class Solution {
    public String longestCommonPrefix(String[] strs) {
        String Shortest = strs[0];

        for(String str : strs) {
            if(str.length()<Shortest.length()) {
                Shortest = str;
            }
        }


        int i = 0;

        while(i<Shortest.length()) {
          for(int j = 0; j<strs.length; j++) {
            if(strs[j].charAt(i)!=Shortest.charAt(i)) {
                return Shortest.substring(0,i);
            }
          } 
          i++; 
        }

        return Shortest;
    }
}