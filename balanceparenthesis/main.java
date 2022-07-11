import java.util.Queue;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char[] ch = new char[100];
       
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        balparen q = new balparen(input.length());


        for (int i = 0; i < input.length(); i++) {
            ch[i] = input.charAt(i);
            if (ch[0] == '(') {

                q.push(ch[i]);


            }



        }
        if(!q.empty())
            q.check();
        else
            System.out.println("Unbalanced");
    }



    //System.out.print("Unbalanced.");
}
