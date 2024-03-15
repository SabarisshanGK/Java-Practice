import java.util.Scanner;

public class Factorial {
    // Function to factorial of given number
    static int factorialOfNumber( int num ){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1;i <=num;i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a number from user
        System.out.print("Enter Number:\t");
        int number = input.nextInt();

        int factorial = factorialOfNumber(number);

        System.out.println("The factorial of given number is: "+factorial);
    }
}
