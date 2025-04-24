
import java.util.*;
;



public  class Deletion{
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data = val;
            left=right=null;
        }
    }
    static TreeNode delete(TreeNode root,int key){
        if(root==null)return null;
        if(root.left==null && root.right==null){
            return (root.data==key) ?null:root;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        TreeNode keyNode=null,temp=null,last=null;
        while(!queue.isEmpty()){
            temp=queue.poll();
            if(temp.data==key)keyNode=temp;
            if(temp.left!=null){
                last=temp;
                queue.add(temp.left);
            }
            if(temp.right!=null){
                last=temp;
                queue.add(temp.right);
            }
        }
        if(keyNode!=null){
            keyNode.data=temp.data;
            if(last.right==temp)last.right=null;
            else last.left=null;
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(11);
        root.left=new TreeNode(9);
        root.right=new TreeNode(7);
        root.right.left=new TreeNode(15);
        root.right.left=new TreeNode(8);
        System.out.println("Inorder before insertion");
        inorder(root);
        root=delete(root,11);
        System.out.println("Inorder after deletion");
        inorder(root);





    }
}