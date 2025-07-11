/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i<size; i++) {
                Node current = queue.poll();
                if(i==size-1) {
                    current.next = null;
                }
                else {
                    current.next = queue.peek();
                }

                if(current.left!=null) {
                    queue.offer(current.left);
                }
                if(current.right!=null) {
                    queue.offer(current.right);
                }


            }
        }

        return root;
    }
}
