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
    int maxDepth=-1;
    public List<Integer> rightSideView(TreeNode root) {
        //  isko ek to kar skte hai level-order se level order ka last last element hum ek list me bahar ke return kar de
        //  ek tareeka hai bina iske ki hum iski height ka use karege kis hieght par hai hum to usme hmm bss rightmost wala hi add karenge.
         List<Integer> l=new ArrayList<>();
         rightView(root,l,0);
         return l;
    }
    public  void rightView(TreeNode root , List<Integer>l ,int depth){
        if(root==null)
        return ;
        if(depth>maxDepth)
        {
            l.add(root.val);
            maxDepth=depth;
        }
        rightView(root.right,l,depth+1);
        rightView(root.left,l,depth+1);
    }
}