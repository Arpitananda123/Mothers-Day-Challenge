import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { 
        this.val = val; 
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LOT {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
        
        if (root == null) {
            return finalAns;
        }

        q.add(root);
        while (!q.isEmpty()) {
            int levels = q.size();
            List<Integer> subLevels = new ArrayList<>();
            
            for (int i = 0; i < levels; i++) {
                TreeNode current = q.poll();
                subLevels.add(current.val);

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

            finalAns.add(subLevels);
        }

        return finalAns;
    }

    // Helper function to print the result
    public static void printLevelOrder(List<List<Integer>> levels) {
        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }

    // Sample test case in the main method
    public static void main(String[] args) {
        LOT sol = new LOT();

        // Creating the binary tree:
        //         1
        //        / \
        //       2   3
        //      / \   \
        //     4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, null, new TreeNode(6));

        List<List<Integer>> result = sol.levelOrder(root);
        
        System.out.println("Level Order Traversal:");
        printLevelOrder(result);
    }
    
}
