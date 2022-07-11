import java.util.Scanner;

public class costumer {
    private String firstname;
    private String lastname;
    private String dob;
    private String ssn;

    public void setFirstname() {
        boolean exit1 = false;
        System.out.println("Customer Information:");
        while (!exit1) {
            System.out.println("First name: ");
            Scanner scanner = new Scanner(System.in);
            firstname = scanner.nextLine();
            int length = firstname.length();
            if (length != 0) {
                this.firstname = firstname;
                exit1 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }

    }

    public void setLastname() {
        boolean exit2 = false;
        while (!exit2) {
            System.out.println("Last name: ");
            Scanner scanner = new Scanner(System.in);
            lastname = scanner.nextLine();
            int lastnamelen = lastname.length();
            if (lastnamelen != 0) {
                this.lastname = lastname;
                exit2 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }
    }

    public void setDob() {
        boolean exit3 = false;
        while (!exit3) {
            System.out.println("Date of birth: ");
            Scanner scanner = new Scanner(System.in);
            dob = scanner.nextLine();
            int length = dob.length();
            if (length != 0) {
                this.dob = dob;
                exit3 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }
    }

    public void setSsn() {
        boolean exit4 = false;
        while (!exit4) {
            System.out.println("Last 4 digits of SSN: ");
            Scanner scanner = new Scanner(System.in);
            ssn = scanner.nextLine();
            int length = ssn.length();
            if (length == 4) {
                this.ssn = ssn;
                exit4 = true;
            } else
                System.out.println("Invalid input, please try again.");
        }
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getDob() {
        return this.dob;
    }

    public String getSsn()
    {
        return this.ssn;
    }
}
