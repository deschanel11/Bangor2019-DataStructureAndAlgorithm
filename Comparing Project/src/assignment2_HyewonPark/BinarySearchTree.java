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
	//�갡 ���ϵ� ��Ʈ�� �޾Ƽ� ������ �ϸ� �� ����� ��Ʈ�� ��� ��Ʈ�ΰɱ�? �������� ��Ʈ? �ƴ� ����Ʈ���� ��Ʈ? �װ� �߿�.
	//=>
	//�� ù ��Ʈ�� �������� ��Ʈ����, ��� insertRec�� ȣ���ϸ鼭 �� ���� root���� ���� �����Ʈ��� �İ���� ��.
	//root.left, root.right, �̷��� ��� left, right child��� ���ϱ�!
	
	
	
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