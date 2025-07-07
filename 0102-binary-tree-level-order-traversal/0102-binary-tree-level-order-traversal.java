/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        List<List<Integer>> ans = new ArrayList<>();

        if(root==null) {
            return ans;
        }
     
            while(!queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();

                int size = queue.size();

                for(int i = 1; i<=size; i++) {
                   TreeNode current = queue.poll();

                   list.add(current.val);

                   if(current.left!=null) queue.offer(current.left);
                   if(current.right!=null) queue.offer(current.right);
                }

                if(!list.isEmpty()) {
                  ans.add(list);  
                }

            }


        return ans;
    }
}