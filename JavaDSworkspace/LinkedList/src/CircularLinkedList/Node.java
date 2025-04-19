package CircularLinkedList;

public class Node {
	private int data;
	private Node next;
	
	public Node(){
		data=0;
		next=null;
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
}
