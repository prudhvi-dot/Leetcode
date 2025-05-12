class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        validPartition(s, 0, new ArrayList<String>(), res);
        return res;
    }

    void validPartition(String s, int index, List<String> list, List<List<String>> res) {
        if(index>=s.length()) {
            res.add(new ArrayList<String>(list));
            return;
        }

        for(int i = index; i<s.length(); i++) {
            String sub = s.substring(index,i+1);

            if(isPalindrome(sub)) {
                list.add(sub);
                validPartition(s, i+1, list, res);
                list.remove(list.size()-1);
            }

        }
    }

    boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while(i<=j) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}