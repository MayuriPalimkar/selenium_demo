package array;

public class array1 {
 
	public static void main(String [] args) {
		
	//	int i1 = 10;
	//	System.out.println(i1);
		
		//array declaration syntax
		// datatype arrayname[] = new datatype[size of array];
		
		int arr[] = new int[10];
		
		//array initialization syntax
		//arrayname[index number]= value ;
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=55;
		arr[6]=60;
		arr[7]=41;
		arr[8]=52;
		arr[9]=96;
	//	arr[10]=64;          array index outof bound exception
		
		System.out.println(arr.length);//to print the size of array
		System.out.println();
		
		for (int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
	}
}
