public class cie1_2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Solution {
        private int diameter = 0;

        public int maxDepth(TreeNode root) {
            return depth(root);
        }

        public int diameterOfBinaryTree(TreeNode root) {
            diameter = 0;
            depth(root);
            return diameter;
        }

        private int depth(TreeNode node) {
            if (node == null)
                return 0;
            int left = depth(node.left);
            int right = depth(node.right);
            
            diameter = Math.max(diameter, left + right);
            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.maxDepth(root));
        System.out.println(sol.diameterOfBinaryTree(root));
    }
}