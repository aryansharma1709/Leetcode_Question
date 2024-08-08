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
    public int pathSum(TreeNode root, int targetSum) {
        return Path(root, targetSum);
    }
    public int Path(TreeNode root, long target){
       if(root==null)
        return 0;
        int c=countPath(root,target);
        int l=Path(root.left,target);
        int r=Path(root.right,target);
        return l+r+c;
    }
    public int countPath(TreeNode root, long target)
    {
        if(root==null)
        return 0;
        int c=0;
        if(root.val-target==0)
        {
            c++;
        }
        int left =countPath(root.left,target-root.val);
         int right =countPath(root.right,target-root.val);
         return left+right+c;
    }
}