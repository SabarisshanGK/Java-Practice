import java.util.Scanner;

public class PalindromeNumber {
    // Function  to check Palindrome Number
    static boolean checkPalindromeNumber( int num ){
        int reverse = 0;
        int numCopy =num;
        while(num>0){
            int rem = num % 10;
            reverse = (reverse*10)+rem;
            num = num/10;
        }
        if(reverse == numCopy){
            return  true;
        }
        return false;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a number from User
        System.out.print("Enter Number:\t");
        int number = input.nextInt();

        boolean isPalindrome = checkPalindromeNumber(number);

        if(isPalindrome){
            System.out.println("The number is a Palindrome Number");
        }
        else {
            System.out.println("It is not Palindrome number");
        }
    }
}
