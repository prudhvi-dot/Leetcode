class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();

        generate(arr, 0, k, 0, n, new ArrayList<Integer>(), res);

        return res;
    }

    void generate(int[] arr, int start, int k, int sum, int n, List<Integer> list, List<List<Integer>> res) {
        if(list.size() == k) {
            if(sum==n) {
                res.add(new ArrayList<Integer>(list));
                return;
            }

            return;
        }

        if(start>=arr.length) {
            return;
        }

        list.add(arr[start]);
        generate(arr, start+1, k, sum+arr[start], n, list, res);
        list.remove(list.size()-1);
        generate(arr, start+1, k, sum, n, list, res);
    }
}