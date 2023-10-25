package CN5005DSA.Sorting;
public class BubbleSort {
	
	 public static void main(String[] args) {  
         int arr[] ={93,42,51,3,455,20,5,100,5487,87,96,21};
         int l=arr.length;
         
         
         for(int i=0;i<l;i++)
         {
             for(int j=0;j<(l-i-1);j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
         System.out.println();
         System.out.println("Ascending order");
         for(int i=0;i<l;i++)
         {
             System.out.print(arr[i]+" ");
         }
     }
 }
	
