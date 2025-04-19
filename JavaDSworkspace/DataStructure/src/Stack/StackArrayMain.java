package Stack;

import java.util.Scanner;

public class StackArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray s1 = new StackArray();
		Scanner sc = new Scanner(System.in);
		
		int value, option;
		
		do{
			System.out.println("--------------------------Menu------------------------------");
			System.out.println("\n1:Start"+"\n2:Push"+"\n3:Pop"+"\n4:Display"+"\n0:Exit");
			
			System.out.println("Enter  choice");
			option = sc.nextInt();
			
			switch(option) {
			
			case 1:
				s1.initStack();
				System.out.println("new stack init");
				break;
				
			case 2:
				System.out.println("Enter number to push");
				value = sc.nextInt();
				s1.push(value);
				break;
				
			case 3:
				value = s1.pop();
				if(value != -1)
					System.out.println("deleted a number "+value);
				break;
				
			case 4:
				s1.display();
				break;
				
			case 5:
				System.exit(option);
			}
			
		}while(option != 0);
		
	}

}
