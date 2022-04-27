package lab04;

import lab.newList;

public class newStack {
	private String [] list = new String [10];
	private int top = 0;
	private static int count =0;
	
	int size () {
		return count;
	}
	
	void push(String data ) {
		if(count >= list.length) {
			System.out.println("the list is full");
		}else if(isEmpty() == true) {
			list[0] = data;
			count ++;
		}else {
			top++;
			list [top] = data;
			count++;
		}
	}
	
	String pop() {
		if(isEmpty()==true) {
			return null;
		}else {
			 String n = list[top];
			 list[top] = null;
			 top=top-1;
			 count = count -1;
			 
			return n;
		}
		
	}
	
	boolean isEmpty () {
		if(count == 0) {
			return true;
		}else return false;
	}
	
	void toArray() {
		for(int i=0; i<count ; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String [] args) {
		newStack s = new newStack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.toArray();
		System.out.println(s.pop());
		s.toArray();
		newList l = new newList();
		
	}
}
