// Program: Insert into a stack and find the minimum after being popped.
import java.util.Scanner;


public class main {


        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

int maxsize = 100;



            stack Stack = new stack(maxsize);
            for(int i =0;i<5;i++)
            {
                int input = scanner.nextInt();
                Stack.push(input);

            }
            while(!Stack.empty()) {
                System.out.println("Number being popped: " + Stack.pop());
                System.out.println("Minimum in the current array: " + Stack.getmin());

            }




        }


}
