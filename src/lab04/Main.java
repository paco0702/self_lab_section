package lab04;

import java.util.regex.Pattern;

public class Main {
	public static void main (String [] args) {
//		
//		// doing stack
//		Stack nS = new Stack();
//		
//		for(int i=0 ; i<nS.sizeOfTheList(); i++) {
//			nS.push(" " +i);
//		}
//		
//		System.out.println("The Top idx is:");
//		System.out.println(nS.getTop());
//		System.out.println();
//		
//		System.out.println("The Top element is");
//		System.out.println(nS.getValue(nS.getTop()));
//		System.out.println();
//		
//		System.out.println("The whole list is: ");
//		nS.toList();
//		System.out.println();
//		System.out.println("Number of element");
//		System.out.println(nS.numOfElement());
//		System.out.println();
//		
//		System.out.println("after pushing, going popping");
//		for(int i=0;i<10 ;i++ ) {
//			System.out.println(nS.pop());
//		}
//		System.out.println();
//		
//		System.out.println("After popping, the element in the list");
//		nS.toList();
		
//		Queue nQ = new Queue();
		
//		System.out.println(nQ.numOfElement());
//		System.out.println("Before enqueue");
//		nQ.toList();
//		System.out.println();
//		nQ.enqueue("10");
//		System.out.println("After enqueue");
//		nQ.toList();
//		System.out.println("The second element");
//		nQ.enqueue("9");
//		nQ.toList();
//		System.out.println("After adding elements, the total number of elements is:");
//		System.out.println(nQ.numOfElement());
//		
//		System.out.println("The element of tail is: ");
//		System.out.println(nQ.getTail());
//		
//		System.out.println("Time to dequeue");
//		nQ.dequeue();
//		System.out.println("after dequeue, the number of element:");
//		nQ.toList();
//		System.out.println(nQ.numOfElement());
//		System.out.println();
//		
		String s = "178 + 99 - 10";
		
		String [] A = new String [11];
		A[0] = "10";
		A[1] = "*";
		A[2] = "(";
		A[3] = "1";
		A[4] = "+";
		A[5] = "9";
		A[6] = ")";
		A[7] = "-";
		A[8] = "3";
		A[9] = "^";
		A[10] = "2";
		
		Queue number = new Queue();
		Stack List = new Stack();

		for(int i=0; i<11; i++)
		{
			if(!A[i].equals(null)) {
				
		if(Pattern.compile("[0-9]").matcher(A[i]).find()) {
			System.out.println("This is number: " + A[i]);
			number.enqueue(A[i]);
			
		}else {
			System.out.println("This operand: "+A[i]);
			
			if(List.isEmpty()==true) {
				List.push(A[i]);
				System.out.println("pushed "+ A[i]);
				System.out.println();
			}else if(A[i].equals("(")|| A[i].equals("{")){
					
					List.push(A[i]);
				}else if(A[i].equals(")")|| A[i].equals("}")){
						
						System.out.println("The closing number is: "+ i);
						while(!List.getTopValue().equals("(")) {
							
							System.out.println("The top value is: "+ List.getTopValue()+" going to be popped");
							number.enqueue(List.pop());
							System.out.println(" The remain number of element: " + List.numOfElement());
							System.out.println();
						}
						System.out.println("The Top value is:" + List.getTopValue());
						String dummy = List.pop();
					}else {
				int size = List.numOfElement();
				for(int j=0; j<size; j++) {
					System.out.println("Number of elements: "+ List.numOfElement());
					System.out.println("The Top value is:" + List.getTopValue());
					if(List.getTopValue().equals("^")) {
						
						System.out.println("The top value is: "+ List.getTopValue()+" going to be popped");
						number.enqueue(List.pop());
						System.out.println(" The remain number of element: " + List.numOfElement());
						System.out.println();
						
					}else if((List.getTopValue().equals("*")|| List.getTopValue().equals("/")) && (A[i].equals("+")||A[i].equals("-"))) {
						
						System.out.println("The top value is: "+ List.getTopValue()+" going to be popped");
						number.enqueue(List.pop());
						System.out.println(" The remain number of element: " + List.numOfElement());
						System.out.println();
						
					}else if((List.getTopValue().equals("-")) && A[i].equals("+")) {
						
						System.out.println("The top value is: "+ List.getTopValue()+" going to be popped");
						number.enqueue(List.pop());
						System.out.println(" The remain number of element: " + List.numOfElement());
						System.out.println();
						
					}else if(List.getTopValue().equals(A[i])) {
						
						System.out.println("The top value is: "+ List.getTopValue()+" going to be popped");
						number.enqueue(List.pop()); 
						System.out.println(" The remain number of element: " + List.numOfElement());
						System.out.println();
					}
				}
				List.push(A[i]);
				System.out.println("pushed " + A[i]);
				System.out.println();
			}
		}
	}
			System.out.println("The " + i +" time looping");
			System.out.println();
}
		System.out.println("The remainning element in the stack: ");
		List.toList();
		
		// after inputed all the element, pop the remaining element in to the queue
		int size = List.numOfElement();
		for(int j=0; j<size; j++) {
			number.enqueue(List.pop());
		}
		
		System.out.println();
		List.toList();
		System.out.println();
		number.toList();
		String [] P = new String [10];
		
		System.out.println("The number of element in queue: "+ number.numOfElement());
		System.out.println();
		
		//start to calculate the value in the queue
		
		System.out.println("starting to calculate the value in the queue: ");
		int Qsize = number.numOfElement();
		Stack calculate = new Stack();
		
		for(int i=0; i<Qsize; i++) {
			String element = number.dequeue();
			if(Pattern.compile("[0-9]").matcher(element).find()) {
				System.out.println("element ( " + element + (" ) is going to be push"));
				calculate.push(element);
			}
			else {
				int firstValue = Integer.parseUnsignedInt(calculate.pop());
				int secValue = Integer.parseUnsignedInt(calculate.pop());
				
				if(element.compareTo("+")==0) {
					System.out.println("Starting to add these two value: "+ firstValue +" and "+ secValue);
					int addition = firstValue + secValue;
					System.out.println("Going to push the value "+ addition+" back to the stack.");
					String newValue = ""+addition;
					calculate.push(newValue);
				}else if(element.compareTo("-")==0){
					System.out.println("Starting to subtract these two value: "+ firstValue +" and "+ secValue);
					int subtraction = secValue - firstValue ;
					System.out.println("Going to push the value "+ subtraction+" back to the stack.");
					String newValue = String.valueOf(subtraction);
					calculate.push(newValue);
				}else if(element.compareTo("*")==0){
					
					System.out.println("Starting to multiple these two value: "+ firstValue +" and "+ secValue);
					int multiple = firstValue*secValue;
					System.out.println("Going to push the value "+ multiple +" back to the stack.");
					String newValue = ""+ multiple;
					calculate.push(newValue);
					
				}else if(element.compareTo("^")==0) {
					System.out.println("Starting to do "+ secValue +" power "+ firstValue);
					double power = Math.pow(secValue, firstValue);
					System.out.println("Going to push the value "+ power +" back to the stack.");
					int dummy = (int)power;
					String newValue = String.valueOf(dummy);
					calculate.push(newValue);
				}else if(element.compareTo("/")==0) {
					System.out.println("Strating to do division with these value "+ secValue + " and "+ firstValue);
					int division = secValue / firstValue;
					System.out.println("Going to push the value " + division+" back to the stack.");
					String newValue = String.valueOf(division);
				}
		    }
			
//			P[i] = number.dequeue();
//			System.out.println(P[i]+" is already dequeued");
		}
		System.out.println("Finishing the looping, pop the result");
		System.out.print("The result is ");
		System.out.println(calculate.pop());
	}

}
