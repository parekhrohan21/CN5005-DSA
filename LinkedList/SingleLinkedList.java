package CN5005DSA.LinkedList;
import java.util.*;

public class SingleLinkedList {
private Node head = null; // First node of the list
private Node tail = null; // Last node of the list
private int size = 0; // the number of nodes in the list
// Append the new list to end of the linked list

Scanner sc = new Scanner(System.in);


public void AddNode(int Data, Boolean flag) {
if (head == null) { // Add the first node as head, if there is no head
head = new Node(Data, null);
tail = head;
size++;
return;
}
Node Temp = new Node(Data, null);  // NODE CLASS
if (flag == true) { // Add node at head
Temp.SetNext(head); // or: Temp.Next = head;
head = Temp;
} else { // Add node at tail
tail.SetNext(Temp);
tail = Temp;
}
size++;
}

// Get the specific element in the desired position
public int GetData(int index) {
	//	int index=sc.nextInt();
	if (index <= 0) {
		return 0;
	}
	Node Current = head;
	// Pass through the linked list to reach to the desired position
	for (int i = 1; i < index; i++) {
		if (Current.GetNext() == null) {
			return 0;
		}
		Current = Current.GetNext();
	}
	return Current.GetData();
	}

//printing selected index
/*
public int Selectprint() {
	System.out.println("Enter index value");
	int userindex=sc.nextInt();
	if (userindex <= 0) {
		return 0;
}
Node Current = head;
int retvalue=0;
// Pass through the linked list to reach to the desired position
for (int i = 1; i < size; i++) {
if (Current.GetNext() == null) {
return 0;
}
if(userindex==size)
	retvalue=Current.GetData();
	
System.out.println("Value is "+retvalue);
}
return Current.GetData();
}
*/
public int Selectprint() {
    System.out.println("Enter index value");
    int userindex = sc.nextInt();

    if (userindex <= 0 || userindex > size) {
        System.out.println("Invalid index");
        return 0;
    }

    Node Current = head;
    int retvalue = 0;

    for (int i = 1; i < userindex; i++) {
        if (Current.GetNext() == null) {
            System.out.println("Index out of range");
            return 0;
        }
        Current = Current.GetNext();
    }

    retvalue = Current.GetData();
    System.out.println("Value is " + retvalue);

    return retvalue;
}



// printing all elements of the list
public void PrintMe() {
Node Current = head;
int ReturnedValue = 0;
for (int i = 0; i < size; i++) {
ReturnedValue = Current.GetData();
System.out.print(ReturnedValue + "-->");
Current = Current.GetNext();
}
System.out.print("null");
}

public int GetSize() {
return size;
}

public void Delete() {
if (head == null) {
System.out.println("Error: Attempt to remove from an empty list");
return;
}


System.out.println("1. Delete from Tail or 2. Delete from head");
char choice=sc.next().charAt(0);
switch(choice) {


/*if (flag == true)*/ 
case'1':{ // Delete from tail
Node Current = head;
for (int i = 0; i < size; i++) {
if (Current.GetNext() == tail) {
tail = null;
Current.SetNext(null);
tail = Current;
size--;
}
Current = Current.GetNext();
}
} break;

//else
case'2':{ // Delete from head
Node Temp = head;
head = head.GetNext();
Temp.SetNext(null);
size--;
} break;
default:System.out.println("Invalid");
}
}
}
