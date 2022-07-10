import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        linklist theList = new linklist();

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            int input = scanner.nextInt();
            theList.insertFirst(input);

        }




            link aLink = theList.deleteFirst();






        theList.displayList();

    }
    }
