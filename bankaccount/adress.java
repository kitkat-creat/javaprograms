import java.util.Scanner;

public class adress {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    public void setAddress1()
    {
        boolean exit1 = false;
        System.out.println("Address Information:");
        while (!exit1) {

            System.out.println("Address 1: ");
            Scanner scanner = new Scanner(System.in);
            address1 = scanner.nextLine();
            int length = address1.length();

            if (length != 0) {
                this.address1 = address1;
                exit1 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }

    }
    public void setAddress2()
    {
boolean exit2 = false;
        while(!exit2)
        {

            System.out.println("Address 2: ");
            Scanner scanner = new Scanner(System.in);
            address2 = scanner.nextLine();
            int length = address2.length();

            if(length != 0)
            {
                this.address2 = address2;
                exit2 = true;
            }
            else
                System.out.println("Invalid input, please try again.");
        }

    }
    public void setCity()
    {
boolean exit3 = false;
        while(!exit3)
        {

            System.out.println("City: ");
            Scanner scanner = new Scanner(System.in);
            city = scanner.nextLine();
            int length = city.length();

            if(length != 0)
            {
                this.city = city;
                exit3 = true;
            }
            else
                System.out.println("Invalid input, please try again.");
        }

    }
    public void setState()
    {
boolean exit4 = false;
        while(!exit4)
        {

            System.out.println("State: ");
            Scanner scanner = new Scanner(System.in);
            state = scanner.nextLine();
            int length = state.length();

            if(length != 0)
            {
                this.state = state;
                exit4 = true;
            }
            else
                System.out.println("Invalid input, please try again.");
        }

    }
    public void setZipcode()
    {
boolean exit5 = false;
        while(!exit5)
        {

            System.out.println("Zipcode: ");
            Scanner scanner = new Scanner(System.in);
            zipcode = scanner.nextLine();
            int length = zipcode.length();

            if(length != 0)
            {
                this.zipcode = zipcode;
                exit5 = true;
            }
            else
                System.out.println("Invalid input, please try again.");
        }

    }

    public String getAddress1()
    {
       return address1;
    }
    public String getAddress2()
    {
        return address2;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
    public String getZipcode()
    {
        return zipcode;
    }
}
