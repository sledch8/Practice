package test3;

public class BST2 {
    //make a node class
    //include an integer value, and a left and right for children nodes
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        //Initialize the Node with the constructor,set the children to null
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }
    
    public Node root;
    //Initialize the root of the BST in the constructor
    // set the root to null to begin

    public BST2(){
        this.root = null;
    }

    public void insert(int value){
        // if BST is empty, set root to a new node with the argument value
        if (this.root == null){
            this.root = new Node(value);
        }

        this.inserthelper(value, this.root);
    }

    private void inserthelper(int value, Node curr){
        if (value<curr.value){
            if (value < curr.value && curr.left == null){
                curr.left = new Node(value);
            }
            else{
                inserthelper(value,curr.left);
            }
        }

        if (value>curr.value){
            if (value > curr.value && curr.right == null){
                curr.right = new Node(value);
            }
            else{
                inserthelper(value,curr.right);
            }
        }

    }

    public void delete(int value){
        this.deleteHelper(value, this.root);
    }

    private Node deleteHelper(int value, Node curr){
        if (curr == null){
            return null;
        }

        else if (value < curr.value){
            this.deleteHelper(value, curr.left);
        }

        else if (value > curr.value){
            this.deleteHelper(value, curr.right);
        }

        else if (value == curr.value){
            if (curr.left == null && curr.right == null){
                curr = null;
                return curr;
            }

            else if (curr.left != null && curr.right == null){
                curr = curr.left;
                curr.left = null;
            }
            else if (curr.left == null && curr.right != null){
                curr = curr.right;
                curr.right = null;
            }
            else{
                Node successor = this.inOrderHelper(curr.right);
                curr.value = successor.value;
                curr.right = this.deleteHelper(successor.value, curr.right);
            }
        }
        return curr;
    } 

    private Node inOrderHelper(Node curr){
        if (curr.left != null && curr.right != null){
            this.inOrderHelper(curr.left);
        }
        return curr;
    }
}

