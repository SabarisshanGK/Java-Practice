import java.util.Scanner;

public class ReverseAGivenNumber {

    //Function to Reverse a number
    public static int reverseNumber(int num){
        int rev = 0;

        while ( num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /=10;
        }
        return rev;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get a number from user
        System.out.print("Enter number:\t");
        int num  = input.nextInt();

        int reverse = reverseNumber(num);

        System.out.println("Reverse of Given number is:\t"+reverse);
    }
}
