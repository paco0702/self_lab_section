package lab;

public class MealOrderingSystem {
	
		public class Node{
			String tableNum;
			Node next;
			
			public Node ( String tableNum, String mealCode, Node next) {
				this.tableNum = tableNum+" " + mealCode;
				this.next = next;
			}
			
			public Node() {
				this("","", null);
			}
		}
		
		
		private Node head = new Node();
		private int count =0;
		
		
		
		public int numOfOrder() {  // Number of order
			return this.count;
		}
		
		
		public void orderWithPosition(int idx,String tableNum, String mealCode) {
			Node prev = this.head;
			Node N = new Node();
			if(idx>count) {
				System.out.println("There is an error");
			}else {
				for(int i=0; i<idx; i++) {
					prev= prev.next;
				}
				addValue(prev, tableNum, mealCode);
			}
		}
		
		public void addValue(Node prev, String tableNum, String MealCode) {
			Node N = new Node();
			N.tableNum = tableNum+ "The meal Code is "+ MealCode;
			N.next = prev.next;
			prev.next = N;
			count = count +1;
		}
		
		public String removeOrder (int idx) {
			Node prev= head;
			if(idx>= this.numOfOrder()) {
				System.out.println("There is an error");
				return "" ;
			}else {
				for ( int i=0; i<= idx; i++) {
					prev = prev.next;
				}
				String removeValue = removeValue(prev);
				return removeValue;
			}
		}
		
		public String nextOrder() {
			Node prev = head;
			Node removeOrder = prev.next;
			prev.next = removeOrder.next;
			this.count = this.count-1;
			try {
			return removeOrder.next.tableNum;
			}catch (NullPointerException e) {
				return"";
			}
		}
		
		public String removeValue(Node prev) {
			System.out.println("the value " + prev.tableNum + " is removed");
			Node N = new Node();
			prev.next = N.next ;
			this.count = this.count -1;
			try{return  N.tableNum;}
			catch(NullPointerException e) {
				return " ";
			}
		}
		
		
		
		public void get(int idx) {
			Node prev = head;
			for(int i=0; i<=idx; i++) {
				prev=prev.next;
				if(i==idx) {
					try {
					System.out.println(prev.tableNum);
					}catch(NullPointerException e) {
						System.out.println("The first index is null");
					}
				break;
				}
			}
		}
		
		public void order(String mealCode, String tableNum) {
			Node prev = head;
			Node theNewFirst = new Node();
			theNewFirst.tableNum = tableNum;
			theNewFirst.next = prev.next;
			prev.next = theNewFirst;
			count = count +1;
		}
		
		public void addLast(String tableNum) {
			Node prev = head;
			Node newEnd = new Node();
			System.out.println(this.numOfOrder());
			for(int i=0; i<=this.numOfOrder(); i++) {
				if(prev.next == null) {
					newEnd.tableNum= tableNum;
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
					System.out.println("The element "+ i +" is "+ prev.next.tableNum);
					prev= prev.next;
				}
			}
		}
	}

