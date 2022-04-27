
public class MyTree2 {
	
	class Node {
		Node left ;
		Node right ;
		int key;
		int sizeOfSub;
		Node(int key){
			left = right = null;
			this.key  = key;
			sizeOfSub =1;
		}
		
		Node(){
			this(0);
		}
		
		int getSizeOfSub() {
			return this.sizeOfSub;
		}
		
	}
	
	Node root;
	Node min = new Node ();
	private static int count= 0;
	
	
	void insert (int key) {
		root = insert(root, key);
		
	}
	
	Node insert(Node node, int key) {
		if(node == null) {
			node = new Node(key);
			count ++;
			if(node.key<min.key || min.key == 0) {
				min = node;
			}

			return node;
			
		}else if(key>node.key) {
			node.right=insert(node.right, key);
			node.sizeOfSub++;
		}else if(key<node.key) {
			node.left = insert(node.left, key);
			node.sizeOfSub++;
			
//			try {
//			if(min.key>node.left.key || min == null) {
//			min = node.left;
//			}
//			}catch(NullPointerException e) {
//				
//			}
		}else if(node.key==key) {
			System.out.println("the node is already exist");
			return null;
		}
		
		return node;
	}
	
	void printSubTree(int k) {
		printSubTree(root, k);
	}
	
	private void printSubTree(Node node, int k) {
		if(node == null) {
			return;
		}else if (node.key < k){
			printSubTree(node.right , k);
		}else if(node.key>k) {
			printSubTree(node.left, k);
			
		}else {
			ascSubTree(node);
		}
	}
	

	private void ascSubTree(Node node) {
		if(node==null) {
			return;
		}
		try {
			ascSubTree(node.left);
		
		}catch(NullPointerException e) {
			
		}
		System.out.print( node.key +"("+ node.sizeOfSub+") ");
		
		try {
			ascSubTree(node.right);
		}catch(NullPointerException e) {
			
		}
	
		
	}
	
	int findMin() {
		return min.key;
	}
	
	
	void changeKey(int k1, int k2 ) {
		changeKey(root, k1, k2);
	}
	
	private void changeKey(Node node, int k1, int k2) {
		if(node == null) {
			System.out.println("This node is not exist");
			return;
		}else if(node.key>k1){
			changeKey(node.left, k1 ,k2);
		}else if(node.key<k1) {
			changeKey(node.right, k1,k2);
		}else {
			if((findParent(k1).key)<k2 && (k2>node.left.key || node.left == null) && (k2<node.right.key || node.right == null) ) {
//				System.out.println("The changing key" + k2);
//				System.out.println("The parent key"+(findParent(k1).key));
//				System.out.println("The target left key"+node.left.key);
//				System.out.println("The targer right key" + node.right.key);
				
				node.key = k2;
			}else {
				System.out.println("changing the key will violate the search tree property");
			}
		}
	}
	
	public Node findParent(int key) {
		return findParent (root, key);
	}
	
	private Node findParent(Node node, int key) {
		if(node == null) {
			return null;
		}else if(node.left.key==key|| node.right.key==key) {
			System.out.println(node.key+ " is the parent of "+key);
			return node;
		}else { 
			if (node.key>key){
				return findParent (node.left , key);
		    }else if(node.key<key) {
				return findParent(node.right, key);
		    }
		}
		return node;
	}
	
	
	void del(int s) {
		del(root, s);
	}
	
	Node del(Node node ,int key) {
		if(node == null) {
			return null;
		}else if(node.key>key) {
			node.left=del(node.left, key);
		}else if(node.key<key){
			node.right = del(node.right,key);
		}else {
			if(node.left == null & node.right ==null) {
				return null;
			}else if(node.left == null) {
				return node.right;
			}else if(node.right ==null) {
				return node.left;
			}
			
			node.key = getMin (node.right);
			node.right = del(node.right, node.key);
		}
		return node;
	}
	
	int getMin() {
		return getMin(root);
	}
	
	
	int getMin(Node node) {
		int Min=node.key;
		while (node.left!=null) {
//			return findMin(node.left);
			Min = node.key;
			node = node.left;
			
		}
		return Min;
	}
	
	
	int findMax() {
		return findMax(root);
	}
	
	
	int findMax(Node node) {
		int Max = node.key;
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
		System.out.printf("%d ",node.key);
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
		System.out.printf("%d ",node.key);
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
		System.out.printf("%d ",node.key);
		
		
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
		System.out.printf("%d ",node.key);
		try {
		descOrder(node.left);
		}catch(NullPointerException e) {
			
		}
	}
	
	
	public static void main(String [] args ) {
		MyTree2 tree = new MyTree2();
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		tree.insert(6);
		tree.insert(4);
		tree.insert(8);
		tree.print(1);
		System.out.println();
//		mt.del("E");
//		mt.print(4);
		
		System.out.println("find Max");
		System.out.println(tree.findMax());
//		System.out.println("find Min");
//		System.out.println(tree.findMin());
		System.out.println();
		System.out.println(tree.findParent(2).key);
		System.out.println();
		
		System.out.println("subtree size of root: ");
		System.out.println(tree.root.key +"("+tree.root.getSizeOfSub()+")");
		System.out.println();
		
		System.out.println("subtree size of root of left child: ");
		System.out.println(tree.root.left.key +"("+tree.root.left.getSizeOfSub()+")");
		System.out.println();
		
		
		tree.changeKey(6, 5);
		tree.print(1);
		System.out.println();
		System.out.println();
		
		tree.printSubTree(5);
		System.out.println();
		System.out.println();
		
		System.out.println("getting the min key");
		System.out.println(tree.min.key);
		System.out.println();
	}
	

}
