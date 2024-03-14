import java.util.Scanner;

public class Sumofdigits {
    // Function to find sum of number of digits Eg: 153 => 1+5+3 = 9
    static int digitSum( int num ){
        int sum = 0;
        while ( num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        return sum;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a number from User
        System.out.print("Enter number:\t");
        int number = input.nextInt();

        int digit_sum = digitSum(number);

        System.out.println("The sum is "+digit_sum);
    }
}
