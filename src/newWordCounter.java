
public class newWordCounter {
	class Node{
		Node left, right;
		String data;
		int numOfE =1;
		Node(String data){
			this.data = data;
			left = right  = null;
		}
		
		Node (){
			this("");
		}
		
		
	}
	
	Node root;
	private static int count =0;
	
	void insert (String w) {
		root = insert(root, w);
	}
	
	Node insert(Node node,String w) {
		if(node == null) {
			node = new Node(w);
			count ++;
			return node;
		}else if(node.data.compareTo(w)>0) {
			node.left = insert(node.left, w);
			
		}else if(node.data.compareTo(w)<0) {
			
			node.right= insert(node.right, w);
		}else if(node.data.compareTo(w)==0) {
			node.numOfE++;
		}
		return node;
	}
	
	void inOrder() {
		inOrder(root);
	}
	
	void inOrder(Node node) {
		if(node == null) {
			return;
		}
	
		inOrder(node.left);
		System.out.print(node.data+" ("+ node.numOfE+") ");
		inOrder(node.right);
		
	}
	
	public static void main(String [] args) {
		newWordCounter w = new newWordCounter();
		w.insert("Alice");
		w.insert("Leo");
		w.insert("Leo");
		w.insert("mark");
		w.insert("paco");
		w.insert("bob");
		w.inOrder();
		System.out.println(w.root.data);
	}
}
