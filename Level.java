 // Print nodes at a given level
class Level{
    int data;
    Node left, right;

    public Level(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

   
    void printGivenLevel(Node node, int level) {
        if (node == null)
            return;

        if (level == 1) {
            System.out.print(node.data + " ");
        } else {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    void printGivenLevel(int level) {
        printGivenLevel(root, level);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);

        int level = 3;
        System.out.print("Nodes at level " + level + ": ");
        tree.printGivenLevel(level);
    }
}
