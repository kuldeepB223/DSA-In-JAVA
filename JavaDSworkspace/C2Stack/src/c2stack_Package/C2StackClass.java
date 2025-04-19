package c2stack_Package;

public class C2StackClass {
	private int size;
	private int arr[];
	private int top1;
	private int top2;
	
	public C2StackClass(){
		size=0;
		arr = new int[size];
		top1=-1;
		top2=size;
	}
	public void initStack(int size) {
		this.size=size;
		arr = new int[size];
		top1=-1;
		top2 = size;
	}
	public boolean isfull() {
		if(top2 ==  top1+1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isempty() {
		if(top1==-1 && top2==size) {
			return true;
		}else {
			return false;
		}
	}
	public void push1(int value) {
		if(!isfull()) {
			top1++;
			arr[top1] = value;
		}else {
			System.out.println("stack is overflow\\n Entered value cannot push in stack ");
		}
	}
	public int pop1() {
		int value = -1, num=0;
		if(!isempty()) {
			num = arr[top1];
			arr[top1--] = value;
		}else {
			System.out.println("stack is underflow");
		}
		return num;
	}
	
	public void push2(int value) {
		if(!isfull()) {
			top2--;
			arr[top2] = value;
		}else {
			System.out.println("stack is overflow \n Entered value cannot push in stack ");
		}
	}
	public int pop2() {
		int value=-1, num=0;
		if(!isempty()) {
			num = arr[top2];
			arr[top2++]= value;
		}else {
			System.out.println("Stack is underflow.");
		}
		return num;
	}
	
	public void display() {
		for(int i=0; i<size; i++) {
			if(arr[i] != 0) {
				System.out.println(" "+arr[i]);
			}
		}
	}
}
