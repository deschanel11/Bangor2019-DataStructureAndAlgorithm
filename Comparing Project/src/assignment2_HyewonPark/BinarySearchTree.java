package assignment2_HyewonPark;

/*

public class BinarySearchTree {

	private int count = 0; //this will record the number of comparison
	

	//Making class Node for Binary Search Tree
	class Node{
		
		int key;
		Node left, right;
		
		//Constructor for Node class
		public Node(int item) {
			key = item;
			
			left = null;
			right = null;
		}
	}
	
	
	
	// make the root node.
	Node root;
	
	
	
	//Constructor for the BinarySearchTree.
	BinarySearchTree(){
		root = null;
	}
	
	
	
	
	
	void insert(int num) {
		root = insertRec(root, num);
	}
	//얘가 리턴된 루트를 받아서 저장을 하면 그 저장된 루트는 어느 루트인걸까? 오리지널 루트? 아님 서브트리의 루트? 그게 중요.
	//=>
	//저 첫 루트는 오리지널 루트지만, 계속 insertRec을 호출하면서 그 많은 root들은 점점 서브루트들로 파고들어가게 됨.
	//root.left, root.right, 이렇게 계속 left, right child들로 들어가니깐!
	
	
	
	public Node insertRec(Node root, int numb) {
		
		if (root == null) {
			root = new Node(numb);
			return root;
		}

		if(numb>root.key) {
			root.right = insertRec(root.right, numb);
			return root;
		}
		else if(numb<root.key) {
			root.left = insertRec(root.left, numb);
			return root;
		}
		else {
			System.out.println("There is already existing key here.");
			return root;
		}
	}
	
	
	
	
	
	
	//getter for count
	int getCount() {
		return count;
	}
	
	
	
	
	
	
}



*/