//package lab07;
//
//public class MyIndex {
//
//	class Node {
//		Node left, right;
//		String key;
//		Record record;
//		
//		public Node(String key, Record record){
//			this.left = null;
//			this.right =null; 
//			this.key = key;
//			this.record = record;
//		}
//		
//	}
//	
//	Node rootK;
//	private static int count =0;
//	
//	public void insert(String key, Record record) {
//		rootK = insert(rootK , key, record);
//	}
//	
//	private Node insert (Node node, String key, Record record) {
//		if (node == null ) {
//			Node N = new Node (key, record );
//			System.out.println("insert the record with "+ record.getCustId() +" And the key is "+ key);
//			count++;
//			return N;
//		}else if(node.key.compareTo(key)>0) {
//			node.left =  insert(node.left, key, record);
//		}else if(node.key.compareTo(key) <0 ) {
//			node.right = insert(node.right, key,record);
//		}
//		return node;
//	}
//	
//	public int size() {
//		return count;
//	}
//	
//	public void find(String key) {
//		try {
//		System.out.println(find(rootK, key).toString());
//		}catch(NullPointerException e) {
//			System.out.println("There is no record that you need to find");
//		}
//	}
//	
//	public Record find ( Node node, String key ) {
//		if(node==null) {
//			System.out.println("The rooot is empty");
//			return null;
//		}else 
//		if(node.key.compareTo(key)==0) {
//			return node.record;
//		}else if(node.key.compareTo(key)>0) {
//			return find(node.left, key);
//		}else if(node.key.compareTo(key)<0) {
//			return find(node.right, key);
//		}else {
//			System.out.println("There is no the record that you want to find");
//			return null;
//		}
//		
//	}
//	
//	public void clear() {
//		rootK = null ;
//		count =0;
//	}
//	public static void main (String [] args) {
//		Record [] re = new Record [6];
//		re[0] = new Record ("A121", "9495-9697", 510);
//		re[1] = new Record ("B106", "6564-6362", 700);
//		re[2] = new Record ("A113", "9989-9799", 920);
//		re[3] = new Record ("B129", "6677-8890", 10000);
//		re[4] = new Record ("B111", "6852-3232", 8500);
//		re[5] = new Record ("C124", "9091-9293", 6410);
//		
//		MyIndex M1= new MyIndex ();
//		M1.insert("A121", re[0]);
//		M1.insert("B106", re[1]);
//		M1.insert("A113", re[2]);
//		M1.insert("B129", re[3]);
//		M1.insert("B111", re[4]);
//		M1.insert("C124", re[5]);
//		
//		System.out.println(M1.size());
//		M1.find("A113");
//		
//		M1.clear();
//		System.out.println(M1.size());
//		M1.find("A121");
//	}
//}
