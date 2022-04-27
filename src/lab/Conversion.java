package lab;

public class Conversion {
	public static void main(String[ ]args) {
		
	int [] A1 = new int [9];
	for(int i=0; i<A1.length; i++) {
		A1[i]= i+1;
	}
	System.out.println(A1.length);
	convert(A1);
	}
	
	public static int [][] convert(int [] originalArray) {
		int [] arraysize = new int [1];
		for(int i=2; ;i++) {
			if (originalArray.length%i==0) {
				arraysize[0]=i;
				break;
			}
		}
		int [][] newArray = new int [arraysize[0]][arraysize[0]];
		int z=0;
		for(int j=0 ;j<newArray.length; j++) {
			for(int k=0; k<newArray[j].length; k++) {
				newArray[j][k] = originalArray[z];
				z++;
			}
		}
		return newArray;
	}
}
