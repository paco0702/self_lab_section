package lab;

public class newList {
	class Node{
		
		Node next;
		int data;

		public Node(int data, Node next) {
			this.data = data ;
			this.next = next ;
		}
		
		public Node(int data) {
			this.data = data ;
			
		}
		public Node() {
			this(0,null);
		}
			
	}
	Node head = new Node();
	private int count =0;
	
	
	int size() {
		return count;
	}
	
	void add(int k, int data) {
		 if(k>count ) {
			System.out.println("this is an error");
		}else if(count ==0) {
			Node N = new Node(data);
			N.next = head.next;
			head.next =N;
			count++;
		}else {
			Node node = head;
			for (int i=1; i<=k; i++) {
				
				node=node.next ;
			}
			
			Node N = new Node(data);
			N.next = node.next ;
			node.next = N;
			count++;
			
				
			
		}
	}
	
	int remove(int k) {
		Node node = head;
		for(int i =0; i<k; i++) {
			node = node.next;
			
		}
		System.out.println(node.next.data);
		Node n = node.next;
		node.next = n.next;
		count--;
		return n.data;
	}
	
	int get(int k) {
		return 0;
	}
	
	void clear() {
		
	}
	
	void toArray() {
		Node node = head.next;
		while(node !=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	void reverse() {
		Node N = new Node();
		int size = 0;
		
		reverse(head, N, size);
		System.out.println(N.next.data);
		
	}
	void reverse(Node node, Node N, int size) {
		if(count == 0) {
			return;
		}
		for(int i=1; i<count; i++) {
			node = node.next;          // go to node before the end
		}
//		System.out.println(node.data);
		Node re = node.next;
		node.next = null;
		count--;
		
		for(int j=1; j<size; j++) {
			N = N.next;
			
		}
		
		re.next = N.next ;
		N.next = re;
		size ++;
		System.out.println(N.data);
		reverse(head, N ,size);
	}
	
	
	public static void main(String [] args) {
		newList L = new newList();
		L.add(0, 1);
//		L.toArray();
		L.add(1, 2);
		L.add(2, 3);
		L.add(3, 4);
		L.toArray();
		System.out.println(L.remove(0));
		L.toArray();
		L.reverse();
		
	}
}
