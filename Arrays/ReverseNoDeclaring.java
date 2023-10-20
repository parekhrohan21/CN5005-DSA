package CN5005DSA.Arrays;
public class ReverseNoDeclaring {
    public static void main(String args[]) {
        
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};
       int len=myArray.length;
    int i = len - 1;//because arrays start with index [0]
    int j = 0;
  while(i > j)
  {
    double temp = myArray[i];
   myArray[i] = myArray[j];
  myArray[j] = temp;
    i--;
    j++;
  }

  //Output contents of now-reversed array.
  for(i = 0; i < len; i++)
    System.out.print(" "+myArray[i]+" ");
    }
}