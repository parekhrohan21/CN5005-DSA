package CN5005DSA.Sorting;
public class SelectionSort {
	 public static void main(String[] args) {  
         int array[] ={10, 33, 28, 5, 63, 224, 6978, 96, 57};
         
         
         int n = array.length;
         int min;
         for (int i = 0; i < n; i++) {
         min = i; // Assuming first element is min
         for (int j = i + 1; j < n; j++) {
         if (array[j] < array[min]) {
         min = j;
         }
         }
         if (min != i) {// Swap
         int temp = array[i];
         array[i] = array[min];
         array[min] = temp;
         }
         }
         System.out.println();
         System.out.println("Ascending order");
         for(int i=0;i<n;i++)
         {
             System.out.print(array[i]+" ");
         }
 }
}
	
