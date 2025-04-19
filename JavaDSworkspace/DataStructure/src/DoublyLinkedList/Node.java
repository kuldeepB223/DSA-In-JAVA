package DoublyLinkedList;

public class Node {
	private int data;
	private Node next;
	private Node prev;
	
	public Node() {
		data = 0;
		next = null;
		prev = null;
	}
	
	public void setdata(int data) {
		this.data=data;
	}
	public int getdata() {
		return data;
	}
	
	public void setnext(Node next) {
		this.next=next;
	}
	public Node getnext() {
		return next;
	}
	
	public void setprev(Node prev) {
		this.prev=prev;
	}
	public Node getprev() {
		return prev;
	}
	
}
