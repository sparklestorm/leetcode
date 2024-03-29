/*
 * @lc app=leetcode id=450 lang=java
 *
 * [450] Delete Node in a BST
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;
    
        if(root.val == key){
            if(root.right == null)
                return root.left;
    
            TreeNode curr = root.right;
            while(curr.left != null)
                curr = curr.left;
            curr.left = root.left;
    
            return root.right;
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
}

