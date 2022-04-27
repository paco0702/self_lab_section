package lab04;

public class Queue {
	public class Node{
		String value;
		Node next;
		
		public Node(String value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Node() {
			this("",null);
		}	
		
	}
	
	private Node head = new Node();
	private int count = 0;
	private Node tail = new Node();
	
	
	public int numOfElement() {
		return this.count;
	}
	
	public void toList() {
		Node prev = head;
		for(int i=0; i<=this.count; i++) {
			System.out.print(prev.value+" ");
			prev = prev.next;
		}
		System.out.println();
	}
	
	public String getTail() {
		return tail.value;
	}
	
	public void enqueue(String value) {
		Node prev = head;
		Node end = tail;
		Node newEnd = new Node();
		newEnd.value=value;
		if(end.next != null) {
			tail = end.next;
		}
		if(head.next == null) {
			System.out.println(head.next);
			newEnd.next = prev.next;
			prev.next = newEnd;
			tail = newEnd;
			count = count +1;
		}else {
			newEnd.next = end.next;
			end.next = newEnd;
			tail = newEnd;
			count = count +1;
		}
//		System.out.println(this.numOfElement());
		
	}
	
	String dequeue() {
		Node prev = head;
		Node end = tail;
		Node removeN = new Node();
		if(count == 0 || isEmpty()== true) {
			return "";
		}else {
			removeN = head.next;
			head.next = removeN.next;
			count = count -1;
			if(count == 0 || head.next == null) {
				tail.next = null;
				return removeN.value;
			}else {
				return removeN.value;
			}
		}
	}
	
	boolean isEmpty() {
		if(head.next.equals(null)) {
			return true;
		}else return false;
	}
}
