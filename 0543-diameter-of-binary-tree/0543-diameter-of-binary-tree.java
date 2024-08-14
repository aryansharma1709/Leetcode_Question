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
    public int diameterOfBinaryTree(TreeNode root) {
        return Daimeter(root).d;
    }
    public Daipair Daimeter(TreeNode root)
    {
         if(root==null)
         {
            return new Daipair();
         }
         Daipair ldp= Daimeter(root.left);
         Daipair rdp =Daimeter(root.right);
         Daipair sdp=new Daipair();
         sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
         int sd=ldp.ht+rdp.ht+2;
         sdp.d=Math.max(sd,Math.max(ldp.d,rdp.d));
         return sdp;
    }
    class Daipair{
        int d=0;
        int ht=-1;
    }
}
    // O(n^2) time complexity

    // public int Daimeter(TreeNode root){
    //     if(root==null)
    //     return 0;
    //     int a=Daimeter(root.left);
    //     int b=Daimeter(root.right);
    //     int sd=height(root.left)+height(root.right)+2;
    //     return Math.max(sd,Math.max(a,b));
    // }
    // public int height(TreeNode root){
    //     if(root==null)
    //     return -1;
    //     int l=height(root.left);
    //     int r=height(root.right);
    //     return Math.max(l,r)+1;
    // }