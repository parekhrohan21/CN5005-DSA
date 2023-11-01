package CN5005DSA.Recursion;

import java.util.Scanner;

public class RecursiveBinarySearch 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Target value");
		int Tar=sc.nextInt();
		System.out.println("Enter max limit");
		int UpperB=sc.nextInt();
		
		System.out.println("Enter min limit");
		int LowerB=sc.nextInt();
		int[] Data= {3, 4, 5, 6, 7, 8, 9};
		
		RecursiveBinarySearch abc=new RecursiveBinarySearch();
		abc.BinarySearch(Data, Tar, LowerB, UpperB);
		int indx=abc.BinarySearch(Data, Tar, LowerB, UpperB);
		System.out.println("Position is "+indx);
		
	}
	
	public int BinarySearch(int[] Data, int Target, int LowerBound, int UpperBound){
		int index = (LowerBound + UpperBound) / 2;
		if (Data[index] == Target) return index; // Find the position
		else if (UpperBound < LowerBound) return -1; // Not find
		else
		{
		if (Data[index] > Target) // Look in lower half
		return BinarySearch(Data, Target, LowerBound, index-1);
		else // Look in upper half
		return BinarySearch(Data, Target, LowerBound+1, UpperBound);
		}
		}
}
