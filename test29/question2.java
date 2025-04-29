//	Given the root of a binary tree, return its maximum depth (i.e., the longest path from the root down to a leaf node)
//Input: [3,9,20,null,null,15,7]
//Output: 3

class TreeNode {
    int valuegiven;
    TreeNode left, right;
    TreeNode(int a) { valuegiven = a; }
}

class question2 {  
    
    public int maximumDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maximumDepth(root.left);
        int rightDepth = maximumDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        question2 solution = new question2();
        int output = solution.maximumDepth(root);
        System.out.println(output); 
    }
}
