package lab;

public class Main {
	public static void main (String [] args ) {
//		List newA = new List (5);
//		newA.add(0, 11);
//		newA.toArray();
//		newA.add(1, 12);
//		newA.toArray();
//		newA.add(2, 13);
//		newA.toArray();
//		newA.add(3, 15);
//		newA.toArray();
//		newA.add(4, 16);
//		newA.toArray();
//		System.out.println(newA.size());
//		newA.add(5, 17);
//		newA.toArray();
//		System.out.println(newA.size());
//		newA.remove();
//		System.out.println(newA.size());
//		newA.toArray();
//		newA.add(0,70);
//		newA.toArray();
//		newA.get(0);
//		System.out.println(newA.size());
//
//		LinkList pointer = new LinkList();
//		pointer.add(0, 11);
//		pointer.get(0);
//		System.out.println();
//		
//		pointer.clear();
//		pointer.get(0);
//		System.out.println();
//		
//		pointer.add(0, 12);
//		pointer.get(0);
//		pointer.addFirst(22);
//		pointer.get(0);
//		System.out.println(pointer.size());
//		pointer.toList();
//		System.out.println();
//		
//		System.out.println("adding the element at the end");
//		pointer.addLast(33);
//		pointer.toList();
//		System.out.println(pointer.size());
//		System.out.println();
//		
//		pointer.remove(2);
//		pointer.toList();
//		
		MealOrderingSystem o1 = new MealOrderingSystem();
		
		System.out.println(o1.numOfOrder());
		o1.orderWithPosition(0," 02" , " 1001");
		System.out.println();
		
		o1.toList();
		System.out.println();
		
		o1.orderWithPosition(0," 01", "1001");
		System.out.println();
		o1.toList();
		System.out.println();
		
		System.out.println(o1.removeOrder(1));
		System.out.println(o1.nextOrder());
		System.out.println();
		System.out.println(o1.nextOrder());
		System.out.println();
		
		o1.order("02", "9202");
		o1.toList();
//		List testList = new List (5);
//		testList.add(6, 66);
//		testList.add(5, 77);
//		testList.add(4, 11);
//		testList.add(0, 11);
//		System.out.println();
//		testList.add(1, 12);
//		testList.toArray();
//		System.out.println(testList.get(2));
//		System.out.println();
//		testList.add(1, 13);
//		testList.toArray();
//		System.out.println(testList.remove(2));
//		System.out.println();
//		testList.toArray();
		
		
	}
}
