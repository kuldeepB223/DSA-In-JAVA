package DynamicStack;

import java.util.Scanner;

public class Que2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Que2 q = new Que2();
		
		System.out.println("Enter string- ");
		String str=sc.next();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			q.push(ch);
		}
		q.display();
	}
}
