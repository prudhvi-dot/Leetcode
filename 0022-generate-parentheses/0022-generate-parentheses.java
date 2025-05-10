class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        generate(list, n, "", 0, 0);

        return list;
    }

    void generate(List<String> list, int n, String str, int open, int close) {
        if(str.length()==n*2) {
            list.add(str);
            return;
        }

        if(open<n) {
            generate(list, n, str+'(', open+1, close);
        }
        if(close<open) {
            generate(list, n, str+')', open, close+1);
        }
    }
}