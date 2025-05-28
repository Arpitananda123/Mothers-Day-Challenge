class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class SumofLeftleaf {
    int sum;

    public void dfs(TreeNode node) {
        if (node.left != null) {
            // Check if it's a left leaf
            if (node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            dfs(node.left);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        if (root != null) {
            dfs(root);
        }
        return sum;
    }

    // Example usage
    public static void main(String[] args) {
        /*
                Constructing the following tree:
                     3
                    / \
                   9  20
                      /  \
                     15   7

                Expected output: 24 (because 9 and 15 are left leaves)
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        SumofLeftleaf solution = new SumofLeftleaf();
        int result = solution.sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + result);
    }
}
