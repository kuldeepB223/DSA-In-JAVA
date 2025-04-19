package singlyLL;

public class empNode{
	private Employee data;
	private Node next;
	
	public empNode(){
		data = new Employee();
		next = null;
	}
	
	public empNode(Employee data) {
		this.data=data;
		this.next=null;
	}
	
	public Employee getdata() {
		return data;
	}
	public void setdata(Employee data) {
		this.data=data;
	}
	
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next=next;
	}
	
	public String toString() {
		return data+" "+next;
	}
}
