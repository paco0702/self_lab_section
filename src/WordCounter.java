import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	class Node {
		Node left ;
		Node right ;
		String key;
		int NumOfE;
		Node(String key){
			left = right = null;
			this.key  = key;
			this.NumOfE = 1;
		}
		
		Node(){
			this("");
		}
	}
	
	Node root;
	private static int count= 0;
	
	
	void insert (String key) {
		root = insert(root, key);
		
	}
	
	Node insert(Node node, String key) {
		if(node == null) {
			node = new Node(key);
			count ++;
			return node;
			
		}else if(key.compareTo(node.key)>0) {
			node.right=insert(node.right, key);
		}else if(key.compareTo(node.key)<0) {
			node.left = insert(node.left, key);
		}else if(key.compareTo(node.key) ==0 ) {
			node.NumOfE++;
			
		}
		
		return node;
	}
	
	void del(String s) {
		del(root, s);
	}
	
	Node del(Node node , String key) {
		if(node == null) {
			return null;
		}else if(node.key.compareTo(key)>0) {
			node.left=del(node.left, key);
		}else if(node.key.compareTo(key)<0){
			node.right = del(node.right,key);
		}else if(node.NumOfE == 1){
			
			if(node.left == null & node.right ==null) {
				return null;
			}else if(node.left == null) {
				return node.right;
			}else if(node.right ==null) {
				return node.left;
			}
			
			node.key = findMin (node.right);
			node.right = del(node.right, node.key);
		}else {
			node.NumOfE = node.NumOfE-1;
		}
		return node;
	
	}
	
	String findMin() {
		return findMin(root);
	}
	
	
	String findMin(Node node) {
		String Min=node.key;
		while (node.left!=null) {
			return findMin(node.left);
		}
		return Min;
	}
	
	
	String findMax() {
		return findMax(root);
	}
	
	
	String findMax(Node node) {
		String Max = node.key;
		while(node.right!=null) {
		return findMax(node.right);
		}
		return Max;
	}
	
	void print() {
		inOrder();
	}
	
	void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		try {
		inOrder(node.left);
		}catch(NullPointerException e) {
			
		}
		System.out.printf("%s %d ",node.key,node.NumOfE);
		try {
		inOrder(node.right);
		}catch(NullPointerException e) {
			
		}
	
		
	}
	
	public static void main (String [] args ) {
		String filename =  "D:\\data.txt";
		WordCounter wordCounter = new WordCounter();
		try {
			Scanner scanner = new Scanner (new File (filename));
			while (scanner.hasNext())
				wordCounter.insert(scanner.next());
		}catch(FileNotFoundException e) {
				
			System.out.println("File dosent exist");
		}
		
		wordCounter.insert("assist");
		wordCounter.print();
		wordCounter.del("assist");
		System.out.println();
		wordCounter.print();
		System.out.println();
		wordCounter.del("assist");
		wordCounter.print();
	}
	
}