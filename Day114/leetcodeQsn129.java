package Day114;

// https://leetcode.com/problems/sum-root-to-leaf-numbers/

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

public class leetcodeQsn129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int sum) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) return sum * 10 + root.val;

        int leftSum = sum(root.left, sum * 10 + root.val);
        int rightSum = sum(root.right, sum * 10 + root.val);

        return leftSum + rightSum;
    }
}
