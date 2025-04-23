//Sum of all nodes

class sum {
    int data;
    Node left, right;

    public sum(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    int sumOfNodes(Node node) {
        if (node == null)
            return 0;

        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }

    int sumOfNodes() {
        return sumOfNodes(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

      

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Sum of all nodes: " + tree.sumOfNodes());
    }
}
