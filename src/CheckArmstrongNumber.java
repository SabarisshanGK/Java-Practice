import java.util.Scanner;

public class CheckArmstrongNumber {

    //Function to find whether it is armstrong number
    static boolean isArmStrong( int a ){
        int original = a;
        int sum = 0;
        while ( a > 0 ){
            int rem = a % 10;
            sum = sum + (rem * rem * rem);
            a = a/10;
        }
        return sum == original;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a number from user to check it is armstrong or not
        System.out.print("Enter Number:\t");
        int num = input.nextInt();

        boolean isArmstrong = isArmStrong(num);

        if(isArmstrong){
            System.out.println("It is an Armstrong Number.");
        }
        else {
            System.out.println("It is not an Armstrong Number.");
        }
    }
}
