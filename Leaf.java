//Count/find leaf nodes in a tree
class Leaf{
    int data;
    Node left, right;

    public Leaf(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

 
    int countLeafNodes(Node node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

   
    int countLeafNodes() {
        return countLeafNodes(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();  

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Number of leaf nodes: " + tree.countLeafNodes());
    }
}
