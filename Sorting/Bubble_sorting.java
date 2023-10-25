package CN5005DSA.Sorting;

import java.util.*;
public class Bubble_sorting
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("Enter five numbers");
        for(int i=0;i<=4;i++)
        {
            n[i]=sc.nextInt();
        }
         for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                if(n[j]>n[i])
                {
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ascending order");
        for(int i=0;i<=4;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}