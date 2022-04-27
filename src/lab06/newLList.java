package lab06;

public class newLList {
	class Node{
		Node next;
		int data;
		public Node() {
			this(0);
		}
		
		public Node (int data) {
			this.data = data;
		}
	}
	
	Node head = new Node();
	private static int count = 0;
	
	boolean isEmpty() {
		if(count ==0) {
			return true;
		}else 
			return false;
	}
	
	void add(int x) {
		if(isEmpty()== true) {
			Node n = new Node(x);
			
			n.next = head.next ;
			head.next = n;
			count ++;
			
		}else {
			Node node = head;
			while(node.next!= null) {
				if(node.next.data > x) {
					break;
				}
				node = node.next;
			}
			Node n = new Node(x);
			n.next = node.next;
			node.next = n;
			count ++;
			
		}
	}
	
	void print() {
		Node node = head.next;
		while (node!= null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	
	public static void main(String [] args) {
		newLList l = new newLList();
		
		l.add(13);
		l.add(2);
		l.add(6);
		
		l.add(23);
		l.add(17);
		l.print();
		
	}
}
