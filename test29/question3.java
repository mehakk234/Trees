//3)	Given a binary tree, find the lowest common ancestor (LCA) of two given nodes p and q.
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
//Output: 3

class TreeNode {
    int valuegiven;
    TreeNode left, right;
    TreeNode(int i) { valuegiven = i; }
}

class question3 {  

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) {
            return root;
        }
        
        return (left != null) ? left : right;
    }
    
    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        TreeNode p = root.left;      
        TreeNode q = root.right;      
        
        question3 solution = new question3();
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.valuegiven);  
    }
}
