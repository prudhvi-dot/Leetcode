class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) {
            return false;
        }
        String str = goal+goal;

        return str.contains(s);
    }
}