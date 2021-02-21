package assignment2_HyewonPark;



/**
 * Node for Binary Search Tree
 * @author ¹ÚÇý¿ø
 *
 */



	/*

public class BinarySearchTree2 {



	int count;

	//Making class Node for Binary Search Tree
	class Node{
		//String key;
		
		String key;
		Node left, right;
		
		//Constructor for Node class
		public Node(String item) {
			key = item;
			
			left = null;
			right = null;
		}
	}
	
	
	
	// make the root node.
	Node root;
	
	
	//Constructor for the BinarySearchTree.
	BinarySearchTree2(){
		root = null;
	}
	
	
	
	
	void insert(String key) {
		root = insertRec(root, key);
	}
	
	public Node insertRec(Node root, String key) {
		
		if (root == null) {
			root = new Node(key);
			return root;
		}
		
	
		else if(key.compareTo(root.key) > 0) {
			root.right = insertRec(root.right, key);
			return root;
		}
		else if(key.compareTo(root.key)<0) {
			root.left = insertRec(root.left, key);
			return root;
		}
		
		
		else {
			System.out.println("There is already existing key here.");
			return root;
		}
		
	}
	
	
	

	
	
	
}


	*/
