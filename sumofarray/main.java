import java.util.Scanner;
// find sums of each element in array and detect for duplicates
public class main {
    public static void main(String[] args){
sumarray sum;
sum = new sumarray();
String duplicate = new String();
        Scanner input = new Scanner(System.in);

        int [] nums = new int[5];
int [] number = new int[5];
for(int i = 1; i < 5; i++) {
    int num = input.nextInt();
nums[i] = num;
number[i] = num;
        if (number[i-1]==number[i]) {
duplicate =("This array has duplicates.");
        }



       nums[i] += nums[i - 1];

sum.setElem(i,nums[i]);


}

for(int f = 1; f < 5; f++)
       {

        System.out.println(sum.getelem(f));

       }
        System.out.println("" + duplicate);


    }
}
