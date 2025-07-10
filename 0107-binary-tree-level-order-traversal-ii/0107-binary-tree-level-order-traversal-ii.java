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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root==null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();


            int size = queue.size();

            for(int i = 0; i<size; i++) {
             TreeNode current = queue.poll();

            temp.add(current.val);

            if(current.left!=null) {
                queue.offer(current.left);
            }

            if(current.right!=null) {
                queue.offer(current.right);
            }   
            }
            
            if(!temp.isEmpty()) {
                list.add(0,temp);
            }
        }

        // Collections.reverse(list);

        return list;
    }
}