
public class BinarySearchTreeImplementation {
	 class Node {
	        int key;
	        Node left, right;
	 
	        public Node(int item) {
	            key = item;
	            left = right = null;
	        }
	    }
	 
	    // Root of BST
	    Node root;
	 
	    // Constructor
	    public BinarySearchTreeImplementation() {
	        root = null; 
	    }
	 
	    // This method mainly calls insertRec()
	    void insert(int key) {
	       root = insertRec(root, key);
	       
	    }
	     
	    /* A recursive function to insert a new key in BST */
	    Node insertRec(Node root, int key) {
	 
	    	if(root!=null)
	    	 if (key < root.key)
		            root.left = insertRec(root.left, key);
	    	 else
	    		 root.right = insertRec(root.right, key);
	        /* If the tree is empty, return a new node */
	        if (root == null) {
	            root = new Node(key);
	           }
	        return root;
	    }
	 
	    void searchElement(int key)
	    {
	    	Node temp=search(root, key);
	    	 if(temp!=null)
	    		 System.out.println(temp.key);
	    	 else
	    		 System.out.println("Key Not found");
	    }
	    public Node search(Node root, int key)
	    {
	        // Base Cases: root is null or key is present at root
	        if (root==null || root.key==key)
	            return root;
	     
		        if (root.key > key)
		            return search(root.left, key);
		        
		        
		        return search(root.right, key);
	        
	    }
	   
	 
	    // A utility function to do inorder traversal of BST
	    void inOrder(Node root) {
	        if (root != null) {
	            inOrder(root.left);
	            System.out.println(root.key);
	            inOrder(root.right);
	        }
	    }
	 
	    // Driver Program to test above functions
	    public static void main(String[] args) {
	        BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();
	 
	        /* Let us create following BST
	              50
	           /     \
	          30      70
	         /  \    /  \
	       20   40  60   80 */
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	 
	        // print inorder traversal of the BST
	       // tree.inOrder(tree.root);
	        //search element
	        tree.searchElement(20);
	    }
	}


