//1)	Given the root of a binary tree, return the inorder traversal of its nodes' values.
//Input: [1,null,2,3] Output: [1,3,2]

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int a) { value = a; }
}

public class question1 {   
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    
    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.left, result);     
        result.add(node.value);           
        inorder(node.right, result);    
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        question1 solution = new question1();
        List<Integer> output = solution.inorderTraversal(root);
        System.out.println(output); 
    }
}
