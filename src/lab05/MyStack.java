package lab05;

public class MyStack {
	class Node {
		Node next ;
		String data ;
		
		public Node (String data){
			this.data = data;
		}
		
		public Node () {
			this("");
		}
	}
	
	Node head = new Node();
	private static int count =0;
	
	void push (String data){
		if(isEmpty() == true) {
			Node node = new Node (data);
			node.next = head.next;
			head.next = node;
			count ++;
		}else {
			Node n = new Node(data);
			Node node = head;
			
			n.next = node.next;
			node.next = n;
			count ++;
		}
	}
	
	void pop() {
		if(isEmpty()==true) {
			return ;
		}else {
			Node node = head;
			Node n = head.next;
			
			node.next = n.next;
			System.out.println(n.data);
			count= count -1;
		}
	}
	
	void getTop() {
		System.out.println( Top().data);
	}
	Node Top() {
		return head.next;
	}
	
	
	
	boolean isEmpty () {
		if(count ==0 && head.next== null) {
			return true;
		}else return false ;
	}
	
	void toList() {
		if(isEmpty()==false) {
		Node node = head.next;
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
		}
	}
	
	public static void main (String [] args ) {
		MyStack s = new MyStack();
		s.push("P");
		s.push("V");
		s.push("Y");
		s.push("I");
		s.toList();
		s.getTop();
		s.pop();
		s.toList();
		
	}
}
 