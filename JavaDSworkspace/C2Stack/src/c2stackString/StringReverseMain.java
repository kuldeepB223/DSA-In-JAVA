package c2stackString;

import java.util.Scanner;

public class StringReverseMain {

	public static void main(String[] args) {
		
		
		int size;
		Scanner sc= new Scanner(System.in);
		String str;
		System.out.println("Enter String: ");
		str=sc.next();
		StringReverse rs = new StringReverse(size=2*str.length());
		
		rs.push1(str);
		rs.display1();
		System.out.println("-----------------------------------------");
		rs.display2();
	}

}

