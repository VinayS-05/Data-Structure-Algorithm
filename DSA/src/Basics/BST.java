package Basics;

public class BST {
    int value;
    BST left, right;

    public BST(int value) {
        this.value = value;
        left = right = null;
    }

    // 1. Insert a node
    public BST insert(BST root, int value) {
        if (root == null) return new BST(value);
        if (value < root.value) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }

    // 2. Delete a node
    public BST delete(BST root, int value) {
        if (root == null) return null;

        if (value < root.value) root.left = delete(root.left, value);
        else if (value > root.value) root.right = delete(root.right, value);
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) return null;
            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Case 3: Two children (Find inorder successor)
            BST successor = minValueNode(root.right);
            root.value = successor.value;
            root.right = delete(root.right, successor.value);
        }
        return root;
    }

    private BST minValueNode(BST node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // 3. Search a node
    public boolean search(BST root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        return value < root.value ? search(root.left, value) : search(root.right, value);
    }

    // 4. Traversals
    public void inorder(BST root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public void preorder(BST root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(BST root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }

    // 5. Height/Depth of tree
    public int height(BST root) {
        if (root == null) return -1; // Height of an empty tree is -1
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // 6. Check if the tree is balanced
    public boolean isBalanced(BST root) {
        if (root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        BST tree = new BST(50); // Create the root node
        tree = tree.insert(tree, 30);
        tree = tree.insert(tree, 70);
        tree = tree.insert(tree, 20);
        tree = tree.insert(tree, 40);
        tree = tree.insert(tree, 60);
        tree = tree.insert(tree, 80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree);
        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree);

        System.out.println("\nSearch 40: " + tree.search(tree, 40));
        System.out.println("Search 100: " + tree.search(tree, 100));

        System.out.println("Height of tree: " + tree.height(tree));
        System.out.println("Is Balanced: " + tree.isBalanced(tree));

        tree = tree.delete(tree, 50);
        System.out.println("Inorder after deleting 50:");
        tree.inorder(tree);
    }
}
