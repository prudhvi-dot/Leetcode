class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        int max = 0;

        int maxLength = 0;

        for(int j = 0; j<s.length(); j++) {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            max = Math.max(max,map.get(s.charAt(j)));

            while((j-i+1 - max) > k) {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }

            maxLength = Math.max(maxLength,j-i+1);
        }

        return maxLength;
    }
}