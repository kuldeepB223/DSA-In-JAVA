package Stack;

import java.util.Scanner;

public class StackAtoZmain {

	public static void main(String[] args) {
		
		StackAtoZ s = new StackAtoZ();
		
		int ch = 65;
		
		for(int i=0; i<26; i++) {
			s.push((char )(ch+i));
		}
		
		s.display();
	}

}
