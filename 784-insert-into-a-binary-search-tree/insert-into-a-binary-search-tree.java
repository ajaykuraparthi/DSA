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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)return new TreeNode(val);
        TreeNode node = root;
        TreeNode temp = null;
        while(node != null){
            temp = node;
            if(node.val > val){
                node =node.left;
            }
            else{
                node = node.right;
            }
        }
        if(temp.val > val){
            temp.left = new TreeNode(val);
        }
        else{
            temp.right = new TreeNode(val);
        }
        return root;
    }
}