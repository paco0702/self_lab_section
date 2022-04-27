package lab06;

public class LList {
	private class Node{
		int value;
		Node next;
		
		public Node (int value) {
			this.value = value;
//			this.next = next;
		}
		
		public Node() {
			this(0);
		}
	}
	
	private Node head = new Node();
	public static int count =0;
	
	public boolean isEmpty() {
		if(head.next==null && count == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void add(int value) {
		Node prev = head;
		
		if(isEmpty()==true) {
			Node N = new Node(value);
			N.next = prev.next;
			head.next = N;
			count++;
		}else {
		while (prev.next!=null) {
				if(prev.next.value==value) {
					return;
				}else if(prev.next.value>value) {
					break;
				}
				prev=prev.next;
		}
		Node N = new Node(value);
		
		N.next = prev.next;
		
		prev.next = N;

		count++;
	
		
	}
	}
	
	LList split() {
		LList newList = new LList();
		int size = count;
		Node prev = head; 
		Node prev2 = newList.head;
		
		for(int i=0; i<size; i++) {
			Node removeN = prev.next;
			if(removeN.value==1) {
				prev.next = removeN.next;
				removeN.next = prev2.next;
				prev2.next = removeN;
				count--;
				newList.count++;
			}else 
			if(removeN.value%2==1) {
				
				prev.next = removeN.next;
				removeN.next = prev2.next;
				prev2.next = removeN;
				count--;
			}else {
				prev=prev.next;
			}
		}
		
		return newList;
	}
	
	public void print() {
		Node prev =head ;
		int size = this.count;
		
		for(int i=0; i<size; i++) {
			try {
			prev = prev.next;
			System.out.print(prev.value+" ");
			}catch(NullPointerException e) {
				
			}
		}
	}
}
