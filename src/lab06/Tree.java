package lab06;

public class Tree {
	
	private class Node {
		Node left, right;
		String data;
		
		public Node(String data) {
			this.left=null;
			this.right = null;
			this.data = data;
		}
		
		public boolean isLeaf(Node root) {
			if(root.left == null && root.right==null) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	Node root;
	
}
