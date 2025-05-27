class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + rightDepth;
        }
        if (root.right == null) {
            return 1 + leftDepth;
        }

        return Math.min(leftDepth, rightDepth) + 1;
    }

    // Sample binary tree and test in main method
    public static void main(String[] args) {
        /*
            Constructed binary tree:
                  1
                 / \
                2   3
               /
              4
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        MinDepth sol = new MinDepth();
        int depth = sol.minDepth(root);
        System.out.println("Minimum depth of the binary tree is: " + depth);
    }
    
}
