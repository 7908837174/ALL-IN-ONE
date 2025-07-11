class Node {
    int data, height;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.height = 1; // Default height
        left = right = null;
    }
}

class AVLTree {
    Node root;

    // Get node height
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Rotate right (LL Case)
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Rotate left (RR Case)
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert with balancing
    public Node insert(Node node, int data) {
        if (node == null) return new Node(data);

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        // LL case
        if (balance > 1 && data < node.left.data) return rotateRight(node);

        // RR case
        if (balance < -1 && data > node.right.data) return rotateLeft(node);

        // LR case
        if (balance > 1 && data > node.left.data) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RL case
        if (balance < -1 && data < node.right.data) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }
}

//     // Iterative In-order traversal
//     public void inorder(Node root) {
//         Stack<Node> stack = new Stack<>();
//         Node current = root;

//         while (current != null || !stack.isEmpty()) {
//             while (current != null) {
//                 stack.push(current);
//                 current = current.left;
//             }

//             current = stack.pop();
//             System.out.print(current.data + " ");
//             current = current.right;
//         }
//     }

//     public static void main(String[] args) {
//         AVLTree tree = new AVLTree();
//         int[] elements = {50, 30, 70, 20, 40, 60, 80};
//         for (int element : elements) {
//             tree.root = tree.insert(tree.root, element);
//         }

//         System.out.println("Balanced Inorder Traversal:");
//         tree.inorder(tree.root);
//     }
// }
