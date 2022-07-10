import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        binarysearchtree tree = new binarysearchtree();

        Scanner scanner = new Scanner(System.in);


        tree.insertinfo(100,"Kathareeya","Atthajaroon","kathar@sky");
        tree.insertinfo(105,"Anne","Belle","ser3@mailer");
        tree.insertinfo(200,"Wooly","Jonas","compel90@nomail");
        tree.insertinfo(345,"Jolly","Hito","container@mail");

        System.out.println("Enter id: ");
        int a = scanner.nextInt();
        binarysearchtree.Student s=tree.find(a);
        System.out.print("Name: " + s.firstname + " " + s.lastname +"\n");
        System.out.println("Email: " + s.emailid);
    }
}
