package CN5005DSA.Arrays;


public class JaggedArray
{ 
	public static void main(String[] args) 
	{ 
		int r = 10; 

	//initializing array
		int arr[][] = new int[r][]; 

	//
		for (int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1]; }

		// Initializing array grid
		int count = 1; 
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) 
				arr[i][j] = count++; 

		}
		// Displaying the values of 2D Jagged array 
		System.out.println("Contents of 2D Jagged Array"); 
		for (int i=0; i<arr.length; i++) 
		{ 
			for (int j=0; j<arr[i].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(); 
		} 
	} 
} 
