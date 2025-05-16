class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1,arr2);


        int[] arr = new int[26];

        for(int i = 0; i<s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<t.length(); i++) {
            arr[t.charAt(i)-'a']--;
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]!=0) {
                return false;
            }
        }

        return true;
    }
}