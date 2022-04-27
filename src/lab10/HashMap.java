package lab10;

public class HashMap {
	int [] table;
	Record [] record;
	int count =0;
	
	HashMap(){
		this.table = new int [10];
		this.record = new Record [10];
	}
	private int hash(int k) {
		return k% table.length;
		
	}
	
	  int length() {
	    	return record.length;
	    }
	
	  
	Record find(String k) {
		if(!this.record[Integer.parseInt(k)].equals(null)) {
			
			System.out.println( this.record[Integer.parseInt(k)].tostring());
			return this.record[Integer.parseInt(k)];
		}else {
			System.out.println("this is no this record");
			return null;
		}
	}
	
	Record remove(String k) {
		if(!this.record[Integer.parseInt(k)].equals(null)) {
			
			System.out.println( this.record[Integer.parseInt(k)].tostring());
			Record r = this.record[Integer.parseInt(k)];
			this.record[Integer.parseInt(k)] = null;
			return r;
		}else {
			System.out.println("this is no this record");
			return null;
		}
	}
	void insert(String k, Record r) {
//		int index, hk, collision=0;
//		index = hk = hash(Integer.parseInt(k));
//		while(table[index] != 0 && table [index] % length() !=9) {
//			collision ++;
//			index = hash(hk+collision);
//		}
//		

//		table[index] = Integer.parseInt(k);
		int size = length();
		if(Integer.parseInt(k)>table.length) {
			Record [] originalTable = this.record;
			this.record = new Record [Integer.parseInt(k)+1];
		
		for(int i=0; i<size; i++) {
			this.record[i] = originalTable[i];
		}
		}
		record[Integer.parseInt(k)] = r;
		count++;
	}
	
	void print() {
		for(int i=0; i<length(); i++) {
			try {
			System.out.println(this.record[i].tostring());
			}catch(NullPointerException e) {
				System.out.println("empty block");
			}
		}
	}
	
	void clear() {
		for(int i=0; i<length();i++) {
			this.table[i] = 0;
			this.record [i] =null;
		}
	}
	
	public static void main(String [] args) {
		Record [] r = new Record [10];
		r[0] = new Record("1","A", 10);
		r[1] = new Record("11","B", 100);
		r[2] = new Record("21","AS", 9);
		r[3] = new Record("4","C", 10);
		r[4] = new Record("5","D", 17);
		r[5] = new Record("6","E", 16);
		r[6] = new Record("7","F", 18);
		r[7] = new Record("8","G", 19);
		r[8] = new Record("9","H", 22);
		r[9] = new Record("10","I", 13);
		
		HashMap h = new HashMap();
		h.insert("1", r[0]);
		h.insert("11", r[1]);
		h.print();
		System.out.println();
		
		System.out.println(h.find("11").tostring());
	}
	
//	class LinkedList{
//		
//		class Node{
//			Node next = new Node();
//			Node(){
//				this.next = null
//			}
//		}
//	}
}
