package lab;

public class List {
	private int size;
	private int [] array;
	private static int count = 0;
	
	public List (int size) {
		this.size = size;
		this.array = new int [size];
	}
	
	public List() {
		this(0);
	}
	
	int size() {
		return this.count;
	}
	
	void add(int idx, int value){
		if(idx <= this.count ) {
			if(this.size == count) { //if it is full
				expand(this.array);
			}
			if(this.array[idx]!=0) {
			shiftArray(idx);
			this.array[idx]= value;
			}else
			this.array[idx]= value;
			count++;
		}else {
			System.out.println("There is an error, Your idx number is not valid");
		}
	}
	
	
	int get(int idx) {
//		for(int i=0; i<=idx; i++) {
//			if(i==idx) {
//			System.out.println(this.array[i]);
//			}
//		} 
		return this.array[idx];
	}
	
	void clear() {
		int [] newArray = new int [this.array.length];
		this.array = newArray;
		this.count=0;
	}
	
	int remove(int idx) {
		int returnValue = this.array[idx];
		this.array [idx ]=0;
		count=count -1;
		return returnValue;
	}
	
	
	void expand(int [] originalArray) {
		int newSize = originalArray.length*2;
		int [] newArray = new int [newSize] ;
		for(int i=0; i<originalArray.length; i++) {  //extends and copy the elements into the new array
			newArray [i] = originalArray[i];
//			System.out.println(newArray[i]);
		}
		System.out.println(newArray.length);
		this.array= newArray;
	}
	
	void shiftArray(int idx) {
		int position =count;
		while (idx <position) {
			array[position]= array[position -1];
			position = position - 1;
		}
	}
	
	void toArray() {
		for ( int i=0; i<this.array.length; i++) {
			System.out.print(this.array[i] + " ");
		}
		System.out.println();
	}
	
	
	
}
