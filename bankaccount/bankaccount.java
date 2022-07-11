import java.util.Scanner;

public class bankaccount {
    private String accnumber;
    private String saving;
    private String checking;
    private String date;

    public void setSaving(String saving)
    {


            this.saving = saving;


    }

    public void setChecking()
    {
this.checking = checking;
    }
    public void setAccnumber()
    {
        boolean exit1 = false;
        while (!exit1) {


            System.out.println("Account number:(6 characters)");

            Scanner scanner = new Scanner(System.in);
            accnumber = scanner.nextLine();
            int length = accnumber.length();
            if (length == 6) {

this.accnumber = accnumber;

                exit1 = true;
            } else
                System.out.println("Invalid, please try again.");
        }




    }
    public void setDate()
    {
        boolean exit2 = false;
        while (!exit2) {
            System.out.println("Create date:");
            Scanner scanner = new Scanner(System.in);
            date = scanner.nextLine();
            int datelength = date.length();
            if (datelength != 0) {
                this.date = date;

                exit2 = true;
            } else
                System.out.println("Invalid, please try again.");

        }
    }
    public String getSaving()
    {
        return this.saving;
    }
    public String getChecking()
    {
        return this.checking;
    }

    public String getAccnumber() {


       return this.accnumber;


    }
    public String getDate()
    {
        return this.date;
    }



    //public String accinfo()
    //{
       // String result = this.accnumber;
        //return result;

    //}
}