import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bankaccount bank = new bankaccount();
        costumer Costumer = new costumer();
       adress Address = new adress();
        boolean exit = false;

        System.out.println("Welcome to CS136 Bank!");
        System.out.println("Please crease a new account:");
        while (!exit) {
            System.out.println("Account type:(saving,checking)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            bank.setSaving(input);
            switch (input) {
                case "saving":
                    bank.setAccnumber();
                    bank.setDate();
                    Costumer.setFirstname();
                    Costumer.setLastname();
                    Costumer.setDob();
                    Costumer.setSsn();
                    Address.setAddress1();
                    Address.setAddress2();
                    Address.setCity();
                    Address.setState();
                    Address.setZipcode();
                    exit = true;

                    break;
                case "checking":
                    bank.setAccnumber();
                    bank.setDate();
                    Costumer.setFirstname();
                    Costumer.setLastname();
                    Costumer.setDob();
                    Costumer.setSsn();
                    Address.setAddress1();
                    Address.setAddress2();
                    Address.setCity();
                    Address.setState();
                    Address.setZipcode();
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
        System.out.println("Account type: " + bank.getSaving());
        System.out.println("Account number: " + bank.getAccnumber());
        System.out.println("Account creation date: " +bank.getDate());
        System.out.println("Costumer Information:");
        System.out.println("First name: " + Costumer.getFirstname());
        System.out.println("Last name: " + Costumer.getLastname());
        System.out.println("Date of birth: " + Costumer.getDob());
        System.out.println("Address Information:");
        System.out.println("\t\t\tAddress1: " + Address.getAddress1());
        System.out.println("\t\t\tAddress2: " + Address.getAddress2());
        System.out.println("\t\t\tCity: " + Address.getCity());
        System.out.println("\t\t\tState: " + Address.getState());
        System.out.println("\t\t\tZipcode:  " + Address.getZipcode());
        System.out.println("\n\n");
        System.out.println("=====================================================");




        for(int i = 3; i > 0; i--) {

            System.out.println("Please verify the last 4 digit of your SSN:(" + i + " attempts)");
            Scanner scanner = new Scanner(System.in);
            String verify = scanner.nextLine();


            if (!verify.equals(Costumer.getSsn())) {
                if (i > 1)
                    System.out.println("Please try again.");
            } else {
                System.out.println("succeeded");
                i = 0;
            }

            if (i == 1)
                System.out.println("Verifications failed.");
        }
















        }

        }








   /* public static void account() {
        boolean exit1 = false;
        boolean exit2 = false;

        bankaccount account = new bankaccount();
        while (!exit1) {


            System.out.println("Account number:(6 characters)");

            Scanner scanner = new Scanner(System.in);
            String userinput = scanner.nextLine();
            int length = userinput.length();
            if (length == 6) {
                account.setAccnumber(userinput);


                exit1 = true;
            } else
                System.out.println("Invalid, please try again.");
        }

        while (!exit2) {
            System.out.println("Create date:");
            Scanner scanner = new Scanner(System.in);
            String dateinput = scanner.nextLine();
            int datelength = dateinput.length();
            if (datelength != 0) {
                account.setDate(dateinput);

                exit2 = true;
            } else
                System.out.println("Invalid, please try again.");

        }


    }
    /*
    public static void costumerinfo()
    {
        boolean exit1 = false;
        boolean exit2 = false;
        boolean exit3 = false;
        boolean exit4 = false;
        costumer costum = new costumer();

        System.out.println("Customer Information:");
        while(!exit1) {
            System.out.println("First name: ");
            Scanner scanner = new Scanner(System.in);
            String firstname = scanner.nextLine();
            int length = firstname.length();
            if (length != 0) {
                costum.setFirstname(firstname);
                exit1 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }

        while(!exit2) {
            System.out.println("Last name: ");
            Scanner scanner = new Scanner(System.in);
            String lastname = scanner.nextLine();
            int lastnamelen = lastname.length();
            if(lastnamelen != 0){
                costum.setLastname(lastname);
                exit2 = true;
            }else
                System.out.println("Invalid input, please try again.");
        }
        while(!exit3) {
            System.out.println("Date of birth: ");
            Scanner scanner = new Scanner(System.in);
            String dob = scanner.nextLine();
            int length = dob.length();
            if (length != 0) {
                costum.setFirstname(dob);
                exit3 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }
        while(!exit4) {
            System.out.println("First name: ");
            Scanner scanner = new Scanner(System.in);
            String ssn = scanner.nextLine();
            int length = ssn.length();
            if (length == 4) {
                costum.setDob(ssn);
                exit4 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }
        //System.out.println(costum.getFirstname());
        //System.out.println(costum.getLastname());
    }
public static void adress() {
    adress Adress = new adress();
    boolean exit1 = false;
    boolean exit2 = false;
    boolean exit3 = false;
    boolean exit4 = false;
    boolean exit5 = false;

    System.out.println("Address Information:");
    while (!exit1) {

        System.out.println("Address 1: ");
        Scanner scanner = new Scanner(System.in);
        String add1 = scanner.nextLine();
        int length = add1.length();

        if (length != 0) {
            Adress.setAddress1(add1);
            exit1 = true;
        } else
            System.out.println("Invalid input, please try again.");
    }

    while(!exit2)
    {

        System.out.println("Address 2: ");
        Scanner scanner = new Scanner(System.in);
        String add2 = scanner.nextLine();
        int length = add2.length();

        if(length != 0)
        {
            Adress.setAddress2(add2);
exit2 = true;
        }
        else
            System.out.println("Invalid input, please try again.");
    }
    while(!exit3)
    {

        System.out.println("City: ");
        Scanner scanner = new Scanner(System.in);
        String add3 = scanner.nextLine();
        int length = add3.length();

        if(length != 0)
        {
            Adress.setCity(add3);
            exit3 = true;
        }
        else
            System.out.println("Invalid input, please try again.");
    }
    while(!exit4)
    {

        System.out.println("State: ");
        Scanner scanner = new Scanner(System.in);
        String add4 = scanner.nextLine();
        int length = add4.length();

        if(length != 0)
        {
            Adress.setState(add4);
            exit4 = true;
        }
        else
            System.out.println("Invalid input, please try again.");
    }
    while(!exit5)
    {

        System.out.println("Zipcode: ");
        Scanner scanner = new Scanner(System.in);
        String add5 = scanner.nextLine();
        int length = add5.length();

        if(length != 0)
        {
            Adress.setZipcode(add5);
            exit5 = true;
        }
        else
            System.out.println("Invalid input, please try again.");
    }

}
*/


    //public static void costumerinfo()
    //{
        //System.out.println("Costumer Information:");
        //System.out.println("First name: ");
        //Str
    //}
