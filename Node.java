//Find height of a tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    
    int height(Node node) {
        if (node == null)
            return -1; 

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    int height() {
        return height(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

           

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is: " + tree.height());
    }
}
