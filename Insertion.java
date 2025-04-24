//insertion of a node
//deletion of node
//solution of insertion
import java.util.LinkedList;
import java.util.Queue;
public class Insertion{
    static class TreeNode{
        int data;
        TreeNode left,right;

        public TreeNode(int val) {
            data=val;
            left=right=null;
        }
        
    }
    public static void insert(TreeNode root,int key){
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.left==null){
                temp.left=new TreeNode(key);
                break;
            }else queue.add(temp.left);
            if(temp.right==null){
                temp.right=new TreeNode(key);
                break;
            }else queue.add(temp.right);
        }


    }
    public static void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        System.out.println("Before insertion");
        inorder(root);
        insert(root,25);
        System.out.println("After Insertion");
        inorder(root);
    }
}