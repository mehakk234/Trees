//Count nodes of a tree
class NodesTree {
    int data;
    Node left, right;

    public NodesTree(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Method to count nodes
    int countNodes(Node node) {
        if (node == null)
            return 0;

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Wrapper
    int countNodes() {
        return countNodes(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Sample tree:
        //       1
        //     /   \
        //    2     3
        //   / \     
        //  4   5    

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Total number of nodes: " + tree.countNodes());
    }
}
