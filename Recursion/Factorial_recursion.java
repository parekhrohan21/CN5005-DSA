package CN5005DSA.Recursion;

import java.util.Scanner;

public class Factorial_recursion {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int n=sc.nextInt();
		
	Factorial_recursion abc=new Factorial_recursion();
	int ans =abc.Factorial_noRecursion(n);
	System.out.println("Ans "+ans);
	}
	
	public int Factorial_noRecursion (int n)
	{
	int fact = 1;
	for (int c = 1 ; c <= n ; c++)
    {
        fact = fact * c;
        //System.out.print(fact+" ");
    }
        return fact;
    
	}
	//System.out.println("Answer "+ fact);
}
