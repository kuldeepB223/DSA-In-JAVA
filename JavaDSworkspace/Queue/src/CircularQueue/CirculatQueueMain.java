package CircularQueue;

import java.util.Scanner;

public class CirculatQueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circular_queue cq = new Circular_queue();
		int option=0, value;
		do {
			System.out.println("1:EnQueue"+"\n2:DeQueue"+"\n3:Display"+"\n0:EXIT");
			System.out.println("Enter your choice: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter value to insert");
				value = sc.nextInt();
				cq.enque(value);
				break;
			case 2:
				value = cq.deque();
				if(value !=0 ) {
					System.out.println("Dequeued value"+value);
				}
				break;
			case 3:
				cq.display();
				break;
			case 0:
				System.exit(0);
				break;
			}
			
		}while(option != 0);
	}

}
