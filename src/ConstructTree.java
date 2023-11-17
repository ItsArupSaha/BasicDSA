import java.util.*;

class Node{
    Node left, right;
    int value;

    public Node(int data){
        value = data;
    }
}

public class ConstructTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node node = createTree();

        inOrder(node);
        System.out.println(heightOfTree(node));
    }

    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
        System.out.println();
    }

    public static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
        System.out.println();
    }

    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
        System.out.println();
    }

    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }

    // height of a tree
    static int heightOfTree(Node root){
        if(root == null) return 0;

        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }
}