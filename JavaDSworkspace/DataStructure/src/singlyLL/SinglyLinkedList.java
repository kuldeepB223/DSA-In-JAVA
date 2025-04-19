package singlyLL;

import java.util.Scanner;

public class SinglyLinkedList {
	private Node head; // create we create head is object of Node class
	static int count=0;
	
	public SinglyLinkedList() {
		head = null;		// to assign address of next node 
	}
	
	public void setHead(Node newnode) {  
		head = newnode;		// It set address of newnode to the section of 1st node
	}
	
	public Node createNewnode() {  
		Node newnode = new Node(); // step 1 -> Allocate memory for newnode at runtime
		count++;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of new node : ");
		newnode.setData(sc.nextInt());  // step 2 -> set value that given from user in newnode.
		
		newnode.setNext(null); // step 3 -> set next 'null' in newnode.
		
		return newnode; //
	}
	
	
	// now all methods for where to add previously added Query.
	
	public void addAtStart() {
		Node newnode = createNewnode();  // first create node then add at start.
		
		if(head == null){		// inside newnode data is 10 and next is null 
			head = newnode;  //if head is null then head's 'null' value is replaced with address of newnode
		}else {
			newnode.setNext(head);  // if head is not null then set null to next of newnode means newnode is became last node.
			head = newnode; 		// and set head as address of newnode
		}
	}
	
	public void addAtEnd() {
		Node newnode = createNewnode();
		Node temp = null;	// firstly declare it without any thought  // it is for reference of head
		
		if(head == null) {	// if head is null then saved address of newnode inside head
			head = newnode;
		}else {
			temp = head;  // if head is not null then whatever address is stored in head that is also saved in temp.
			while(temp.getnext()!= null) {		// continue traversing to find out last node till temp's next has null.
				temp = temp.getnext();
			}
			temp.setNext(newnode);		//set newnode address in temp  // It is connecting to last node i.e., temp
		}
	}
	
	public void addAtMid(int value) {  // this method has parameter for addressing where to create newnode.
		Node newnode = createNewnode();
		Node temp = null;  // 
		
		if(head == null) {  // if head is null
			head = newnode;		// then set newnode address inside head.
		}else if(head.getnext() == null){  // if head's next section has stored null then 
			
			if(head.getData() == value) { //if head's data is equal to value then store the address of newnode in head's next 
				head.setNext(newnode);
			}else {
				System.out.println("Error. Value not found"); // if head's data is not equal to value then give an error
			}
		}else {
			temp = head;
			
			while (temp != null && temp.getData() != value) {
				temp = temp.getnext();
			}
			
			if(temp != null) {
				newnode.setNext(temp.getnext());
				temp.setNext(newnode);
			}else {
				System.out.println("Error  Node not exist");
			}
		}
	}
	
	public void display() {
		Node temp = head;
		if(temp == null) {
			System.out.println("Error : linked list is empty.");
		}else {
			System.out.println("Count: "+count);
			while(temp != null) {
				System.out.print(temp.getData() + " -> ");
				temp = temp.getnext();
			}
			System.out.println("null");
		}
	}
}
