class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) return res;


        combination("",digits,0,res,map);

        return res;
    }

    void combination(String ans, String digits, int index, List<String> res, HashMap<Character,String> map) {
        if(index>=digits.length()) {
            res.add(ans);
            return;
        }

        String letters = map.get(digits.charAt(index));
        for(int i = 0; i<letters.length(); i++) {
            combination(ans+letters.charAt(i), digits, index+1, res, map);
        }
    }
}