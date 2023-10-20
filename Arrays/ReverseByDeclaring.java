package CN5005DSA.Arrays;
public class ReverseByDeclaring
{
    public static void main(String[] args) {
   double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0}; 
     
  //printing array starting from first element
    System.out.println("Original Array:");
    for(int i=0;i<myArray.length;i++)
         System.out.print(myArray[i] + "  ");
     
    System.out.println();
     
    //printing array starting from last element
    System.out.println("\nReverse order:");
         for(int i=myArray.length-1;i>=0;i--)
         System.out.print(myArray[i] + "  ");
    }
}
