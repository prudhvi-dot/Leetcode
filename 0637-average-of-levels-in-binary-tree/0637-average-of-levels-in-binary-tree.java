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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {
            long sum = 0;
            long size = queue.size();
            
            for(int i = 1; i<=size; i++) {
                TreeNode current = queue.poll();
                sum+=current.val;

                if(current.left!=null) {
                    queue.offer(current.left);
                }

                if(current.right!=null) {
                    queue.offer(current.right);
                }
            }

            Double avg = (double)sum/(double)size;

            list.add(avg);

        }

        return list;
    }
}