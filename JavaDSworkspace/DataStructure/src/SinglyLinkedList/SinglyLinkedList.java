package SinglyLinkedList;

import java.util.Scanner;

import singlyLL.Node;

public class SinglyLinkedList {
	private Node head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public Node createNewnode() {
		Node newnode = new Node();			// create a node 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data - ");
		newnode.setData(sc.nextInt());			// set data in our node
		newnode.setNext(null);					// set null in our node's next
		
		return newnode;
	}
	
	public void addAtstart() {
		Node newnode = createNewnode();
		
		if(head == null) {
			head=newnode;
		}else {
			newnode.setNext(head);
			head = newnode;
		}
	}
	
	public void display() {
		Node temp = head;
		if(head == null) {
			
		}
	}
	
	
}
