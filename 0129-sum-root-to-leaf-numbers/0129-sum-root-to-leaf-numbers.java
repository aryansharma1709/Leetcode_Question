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
    public int sumNumbers(TreeNode root) {
       return number(root,0); 
    }
    public int number(TreeNode root , int sum)
    {
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        return (sum*10)+root.val;
        int left =number(root.left,sum*10+root.val);
        int right =number(root.right,sum*10+root.val);
        return  left+right;
//  isko hum pre order tracversal se bhi kar skte the usme jab hum leaf node par ho to list me add karte jao aur phir us list ko sum kar lo space use hoga usme.
//  ye bina space use kiye hai ki ek variable banao aur usko height wise 10 ka multiple hota jayega
    }
}