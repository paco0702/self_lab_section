

public class MyTree {
	class Node {
		Node left ;
		Node right ;
		String key;
		
		Node(String key){
			left = right = null;
			this.key  = key;
		}
		
		Node(){
			this("");
		}
	}
	
	Node root;
	private static int count= 0;
	
	
	void insert (String key) {
		root = insert(root, key);
		
	}
	
	Node insert(Node node, String key) {
		if(node == null) {
			node = new Node(key);
			count ++;
			return node;
			
		}else if(key.compareTo(node.key)>0) {
			node.right=insert(node.right, key);
		}else if(key.compareTo(node.key)<0) {
			node.left = insert(node.left, key);
		}else if(node.key.compareTo(key)==0) {
			System.out.println("the node is already exist");
			return null;
		}
		
		return node;
	}
	
	void del(String s) {
		del(root, s);
	}
	
	Node del(Node node , String key) {
		if(node == null) {
			return null;
		}else if(node.key.compareTo(key)>0) {
			node.left=del(node.left, key);
		}else if(node.key.compareTo(key)<0){
			node.right = del(node.right,key);
		}else {
			if(node.left == null & node.right ==null) {
				return null;
			}else if(node.left == null) {   
				return node.right;
			}else if(node.right == null) {
				return node.left;
			}
			
			node.key = findMin (node.right);
			node.right = del(node.right, node.key);
		}
		return node;
	}
	
	String findMin() {
		return findMin(root);
	}
	
	
	String findMin(Node node) {
		String Min=node.key;
		while (node.left!=null) {
//			return findMin(node.left);
			Min = node.key;
			node = node.left;
			
		}
		return Min;
	}
	
	
	String findMax() {
		return findMax(root);
	}
	
	
	String findMax(Node node) {
		String Max = node.key;
		while(node.right!=null) {
		return findMax(node.right);
		}
		return Max;
	}
	
	void print(int order) {
		switch (order) {
		case 1:
			preOrder();
			break;
		case 2:
			inOrder();
			break;
		case 3:
			postOrder();
			break;
		case 4:
			descOrder();
			break;
		}
	}
	
	void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.printf("%s ",node.key);
		try {
		preOrder(node.left);
		preOrder(node.right);
		}catch(NullPointerException e) {
			
		}
		
	}
	
	void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		try {
		inOrder(node.left);
		}catch(NullPointerException e) {
			
		}
		System.out.printf("%s ",node.key);
		try {
		inOrder(node.right);
		}catch(NullPointerException e) {
			
		}
	
		
	}
	
	void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(Node node) {
		if(node == null) {
			return;
		}
		try {
		postOrder(node.left);
		postOrder(node.right);
		}catch(NullPointerException e) {
			
		}
		System.out.printf("%s ",node.key);
		
		
	}
	
	void descOrder() {
		descOrder(root);
	}
	private void descOrder(Node node) {
		if(node ==null) {
			return;
		}
		try {
		descOrder(node.right);
		}catch(NullPointerException e){
			
		}
		System.out.printf("%s ",node.key);
		try {
		descOrder(node.left);
		}catch(NullPointerException e) {
			
		}
	}
	

}