import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int maxsize = 100;
        myarray arr;
        arr = new myarray(maxsize);

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int input = scanner.nextInt();
            arr.insert(input);
        }
        System.out.println("Enter the K:");
        int k = scanner.nextInt();


        arr.selectionSort();
System.out.println("Kth largest number: " + arr.largestkth(k));
    }
}
