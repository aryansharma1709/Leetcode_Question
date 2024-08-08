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
    public boolean hasPathSum(TreeNode root, int targetSum) {
         return pathSum(root,0,targetSum);
    }
    public boolean pathSum(TreeNode root, int sum ,int target)
    {
        if(root==null)
        return false;
        if(root.left==null && root.right==null)
        {
            return target==sum+root.val;
        }
        boolean a=pathSum(root.left,sum+root.val,target);
        boolean b=pathSum(root.right,sum+root.val,target);
        return a||b;
    }
}