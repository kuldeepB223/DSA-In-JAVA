import java.util.Scanner;

public class Stackmain {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        i
        
        System.out.println("Enter number - ");
        int num = sc.nextInt();

        System.out.println("Enter what you want :- ");
        System.out.print("1 : push  \n 2 : pull \n 0 : Exit");
        int choice = sc.nextInt();

    
        switch(choice != 0){
            case 1:  // push
                if(isEmpty()){
                    top = num;
                    top++;
                }else if(top == -1){
                    top = num;
                    top++;
                }else{
                    System.out.println("Stack is full");
                }
            case 2:  // pull
                if(top != -1){
                    top--;

                }

            case 0: //Exit
        }

    }
}
