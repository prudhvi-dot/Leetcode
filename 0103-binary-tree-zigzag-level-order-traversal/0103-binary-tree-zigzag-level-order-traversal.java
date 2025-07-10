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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = 1;


        Queue<TreeNode> queue = new LinkedList<>();

        List<List<Integer>> list = new ArrayList<>();

        if(root==null) {
            return list;
        }

        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

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

                if(level%2==0) {
                    Collections.reverse(temp);
                }  

            if(!temp.isEmpty()) {
                list.add(temp);
            }

            level++;

        }

        return list;
    }
}