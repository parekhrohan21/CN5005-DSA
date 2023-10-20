//package linkedlistw3;

package CN5005DSA.LinkedList;
import java.util.Scanner;// user input choice
public class Main {
public static void main(String[] args) {
// Scan the user input
int Input = 0;
// A call to SingleLinkedList class
SingleLinkedList List = new SingleLinkedList();
// Reading from user input
Scanner Reader = new Scanner(System.in);

System.out.println("Enter the initial size");
int size= Reader.nextInt();

for(int i=1;i<=size;i++) {
System.out.println("Enter the input");
Input = Reader.nextInt();
List.AddNode(Input, false); }

/*
System.out.println("Enter input");
Input = Reader.nextInt();
List.AddNode(Input, true);	}  */
//List.Delete(false);
// user input
char choice;
do {
	System.out.println();
    System.out.println(" User Choice ");
    System.out.println("1. Print all the elements");//printme method
    System.out.println("2. Print selected element");
    System.out.println("3. Delete one element");
    System.out.println("4. Quit");
  
    System.out.print("Enter a choice:- ");
    choice=Reader.next().charAt(0);
    switch(choice) {
    case'1':List.PrintMe(); break;
    case'2':List.Selectprint(); break;
            /*{	System.out.println("Enter index value");
    			int ar=Reader.nextInt();
    			List.GetData(ar);}break;
                           */
    case'3':List.Delete();break;
    case'4':System.out.println("GoodBye!");break;
    default:System.out.println("Invalid");
    }
 } while(choice!='4');

} } 