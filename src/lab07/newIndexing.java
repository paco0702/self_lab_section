package lab07;

public class newIndexing<K extends Comparable <? super K>, V> {
	class Node{
		Node left , right;
		K key ;
		V record;
		
		Node(K key, V record){
			this.record = record;
			this.key = key;
			left = right= null;
		}
		
	}
	private static int count =0;
	private Node root;
	
	void insert (K k,V r) {
		root = insert(root,k,r);
	}
	Node insert(Node node ,K k, V r) {
		
		if(node == null) {
			node = new Node (k,r);
			count ++;
			return node;
		}else if(node.key.compareTo(k)>0){
			return node.left = insert(node.left, k,r);
		}else if(node.key.compareTo(k)<0) {
			return node.right = insert(node.right, k, r);
		}
		return node;
	}
	
	V find(K k) {
		return find(root, k);
	}
	
	V find(Node node, K k) {
		if(node.key.compareTo(k)>0){
			return find(node.left, k);
		}else if(node.key.compareTo(k)<0) {
			return find (node.right, k);
		}else if(node.key.compareTo(k)==0) {
			return node.record;
		}else 
			return null;
	}
	
	public static void main(String [] args) {
		Record [] re = new Record [6];
		re[0] = new Record ("A121", 9495-9697, 510);
		re[1] = new Record ("B106", 6564-6362, 700);
		re[2] = new Record ("A113", 9989-9799, 920);
		re[3] = new Record ("B129", 6677-8890, 10000);
		re[4] = new Record ("B111", 6852-3232, 8500);
		re[5] = new Record ("C124", 9091-9293, 6410);
		newIndexing <String,Record> i = new newIndexing();
		i.insert("A121", re[0]);
		i.insert("B106", re[1]);
		System.out.println(i.find("B106").toString());
		
	}
	
}
