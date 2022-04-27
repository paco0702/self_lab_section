package lab04;

public class ArrayQueue {
	String [] list = new String[10];
	private int head =0;
	private int rear =0;
	private static int count = 0;
	
	boolean isEmpty() {
		if(count ==0)
			return true;
		else return false;
	}
	
	int size() {
		return count;
	}
	
	void enqueue (String data) {
		if(size()>list.length) {
			System.out.println("There is an error");
			return;
		}else if(isEmpty()==true) {
			list[0] = data;
			count++;
		}else {
			rear = rear+1;
			list[rear] = data;
			count++;
		}
	}
	
	String dequeue() {
		if(isEmpty()==true ) {
			return "There is an error";
		}else {
			String data = list[head];
			 list[head] = null;
			head ++;
			count --;
			return data;
		}
	}
	void toList() {
		for(int i=head; i<=rear; i++) {
			
			System.out.print(list[i]+" ");
			
		}
		System.out.println();
		
	}
	
	public static void main(String [] args) {
		ArrayQueue q = new ArrayQueue();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		q.toList();
		q.dequeue();
		q.toList();
	}
}
