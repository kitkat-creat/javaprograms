import java.util.Scanner;
// Menu function to draw a line, dot, triangle with while loop
// main features: while loop, switch statement, functions, for
public class main {
    public static void main(String[] args)
    {

        boolean exit = false;

        while(!exit) {
            System.out.println("Select an item:");
            System.out.println("1 - Draw a dot");
            System.out.println("2 - Draw a line");
            System.out.println("3 - Draw a square");
            System.out.println("4 - Draw a rectangle");
            System.out.println("5 - Draw a right triangle");
            System.out.println("6 - Draw an Isosceles triangle");
            System.out.println("7 - Exit");

            System.out.print("Enter a selection:");
            Scanner scanner = new Scanner(System.in);
            int userInputInt = scanner.nextInt();

            switch (userInputInt) {
                case 1:
                    drawdot();
                    break;
                case 2:
                    drawline();
                    break;
                case 3:
                    drawsquare();
                    break;
                case 4:
                    drawrect();
                    break;
                case 5:
                    drawrighttri();
                    break;
                case 6:
                    drawisos();
                    break;
                case 7:
                    System.out.print("Exiting...");
                    exit = true;

                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }


public static void drawdot()
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of empty spaces: ");
    int numemptyspaces = scanner.nextInt();
    for(int i = 0; i < numemptyspaces; i++)
    {
        System.out.print(" ");
    }
    System.out.println("*");
}
public static void drawline()
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length: ");
    int length = scanner.nextInt();
    for (int i = 0; i < length; i++) {
        System.out.print("*");
    }
}
public static void drawsquare()
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter side length: ");
    int sidelength = scanner.nextInt();
    for (int i = 0; i < sidelength; i++) {
        for (int a = 0; a < sidelength; a++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void drawrect()
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter width: ");
    int width = scanner.nextInt();
    System.out.print("Enter height: ");
    int height = scanner.nextInt();
    for (int i = 0; i < height; i++) {
        for (int a = 0; a < width; a++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void drawrighttri()
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter side length for right triangle: ");
    int sidelentri = scanner.nextInt();
    for (int i = 0; i < sidelentri; i++) {
        for (int a = 0; a < i; a++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void drawisos()
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter side length for isosceles: ");
    int sidelenisos = scanner.nextInt();
    for (int i = 0; i < sidelenisos; i++) {

        for (int a = 0; a < sidelenisos - i; a++) {

            System.out.print(" ");

        }
        for (int b = 0; b < 2 * i + 1; b++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
}
