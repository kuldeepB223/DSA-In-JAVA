package DynamicStack;

import java.util.Scanner;

public class DstackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dstack ds = new Dstack();
		Scanner sc = new Scanner(System.in);
		
		int option;
		do {
		System.out.println("Enter your choice\n\n1. push\n 2. pop\n 3. display\n 0. exit");
		option = sc.nextInt();
		
		switch(option) {
		
		case 1: 
			System.out.println("Enter value to push - ");
			int value = sc.nextInt();
			ds.push(value);
			break;
		case 2:
			value = ds.pop();
			if(value!=-1)
				System.out.println("\nPopped:: "+ value);
			break;
		case 3:
			ds.display();
			break;
		case 0:
			System.exit(0);
			break;
		}
		}while(option != 0);
	}

}
