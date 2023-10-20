package CN5005DSA.LinkedList;

public class Node {
int Data;
Node Next;
// Create a new Node
public Node(int _data, Node _next) {
Next = _next;
Data = _data;
}
// Go to the next node in the list
public Node GetNext() {
return Next;
}
// Return Data of a Node
public int GetData() {
return Data;
}
// Add Data in a the list
public void SetData(int _data) {
Data = _data;
}
// Set the new next pointer
public void SetNext(Node _next) {
Next = _next;
}
}
