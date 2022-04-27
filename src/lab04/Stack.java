package lab04;

public class Stack {
	private String [] list = new String [10];
	static private int count=0;
	static private int top = 0;
	
	int sizeOfTheList() {
		return list.length;
	}
	
	int numOfElement() {
		return this.count;
	}
	
	void remove() {
		list[top]= null;
		this.top= this.top-1;
	}
	
	void push (String value) {
		if(count>= this.list.length) {
			System.out.println("The list is full, need to be expanded");
			
		}else if(isEmpty()==true){
			list[top] = value;
			count++;
		}
		else
		{
			this.top = this.top +1;
			list [top] = value;
			 count++; 
		}
	}
	
	String pop() {
		if(isEmpty() == true) {
			return "the list is empty";
		}else {
			String value = list [top];
			
			list[top]=null;
			count = count -1;
			if(top>0) {
			top = top-1;
			}
			return value;
		}
	}
	
	boolean isEmpty() {
		if(count == 0) {
			return true;
		}else 
			return false;
	}
	
	int getTop() {
		return this.top;
	}
	
	String getTopValue() {
		return this.list[this.top];
	}
	
	void toList() {
		for(int i=0; i<this.list.length; i++) {
			System.out.print(this.list[i]+" ");
		}
	}
	
	String getValue(int idx) {
		if(idx<=this.count)
		return this.list[idx];
		else 
			return "the idx is out of room";
	}
}
