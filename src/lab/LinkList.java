package lab;

public class LinkList {
	public class Node{
		int value;
		Node next;
		
		public Node ( int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Node() {
			this(0, null);
		}
	}
	private Node head = new Node();
	private int count =0;
	
	
	
	public int size() {  // Number of order
		return this.count;
	}
	
	
	public void add(int idx, int value) {
		Node prev = this.head;
		if(idx>count) {
			System.out.println("There is an error");
		}else {
			for(int i=0; i<idx; i++) {
				prev= prev.next;
			}
			addValue(prev, value);
		}
	}
	
	public void addValue(Node prev, int value) {
		Node N = new Node();
		N.value = value;
		N.next = prev.next;
		prev.next = N;
		count = count +1;
	}
	
	public int remove (int idx) {
		Node prev= head;
		if(idx>= this.size()) {
			System.out.println(" There is an error");
			return 0;
		}else {
			for ( int i=0; i<= idx; i++) {
				prev = prev.next;
			}
			int removeValue = removeValue(prev);
			return removeValue;
		}
	}
	
	public int removeValue(Node prev) {
		Node removeNode = prev;
		System.out.println("the value " + removeNode.value + " is removed");
		Node N = new Node();
		prev.next = N.next ;
		this.count = this.count -1;
		return removeNode.value;
	}
	
	
	
	public void get(int idx) {
		Node prev = head;
		for(int i=0; i<=idx; i++) {
			prev=prev.next;
			if(i==idx) {
				try {
				System.out.println(prev.value);
				}catch(NullPointerException e) {
					System.out.println(" The first index is null");
				}
			break;
			}
		}
	}
	
	public void addFirst(int value) {
		Node prev = head;
		Node theNewFirst = new Node();
		theNewFirst.value = value;
		theNewFirst.next = prev.next;
		prev.next = theNewFirst;
		count = count +1;
	}
	
	public void addLast(int value) {
		Node prev = head;
		Node newEnd = new Node();
		System.out.println(this.size());
		for(int i=0; i<=this.size(); i++) {
			if(prev.next == null) {
				newEnd.value= value;
				newEnd.next=null;
				prev.next = newEnd;
				count=count +1;
			}else 
			prev=prev.next;
		}
	}
	
	
	
	
	public void clear() {
		Node prev = head;
		prev.next= null;
		this.count =0;
	}
	
	public void toList() {
		Node prev = head;
		for(int i=0; i<this.count; i++) {
			if(prev.next==null)
				break;
			else {
				System.out.println("The element "+ i +" is "+ prev.next.value);
				prev= prev.next;
			}
		}
	}
}
