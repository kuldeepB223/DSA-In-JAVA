package SinglyLinkedList;

public class Node {
	private int data;
	private Node next;
	
	Node(){
		data=0;
		next=null;
	}
	Node(int data){
		this.data = data;
		next=null;
	}
	
	public int getdata() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	
	public void setdata(int data) {
		this.data = data;
	}
	public void setnext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return data+" "+next;
	}
}
