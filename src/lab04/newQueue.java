package lab04;

public class newQueue {
	class Node{
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
		}
		public Node () {
			this("");
		}
	}
	Node head = new Node ();
	Node tail = new Node ();
	private static int count =0;
	
	int size () {
		return count;
	}
	
	boolean isEmpty() {
		if(count ==0) {
			return true;
		}else return false;
	}
	
	String getTail() {
		return tail.data;
	}
	
	void enqueue(String data) {
		if(isEmpty()== true) {
			Node n = new Node(data);
			n.next = head.next;
			head.next = n;
			tail = n;
			count ++;
		}else {
			Node node = head;
			while(node.next!=null) {
				node=node.next;
			}
			
			Node n = new Node(data);
			n.next = node.next;
			node.next = n;
			count ++ ;
			tail = n;
		}
	}
	
	Node dequeue () {
		Node node = head.next;
		for(int i=1; i<size()-1; i++) {
			node = node.next;
		}
		
		Node n = node.next;
		node.next = n.next;
		tail = node;
		count--;
		
		return n;
	}
	
	void toList() {
		Node node = head.next;
		while(node!= null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		newQueue q = new newQueue();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		q.toList();
		System.out.println(q.getTail());
		System.out.println(q.dequeue().data);
		
	} 
}
