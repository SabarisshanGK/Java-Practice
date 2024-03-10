import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Get the number to find the fibocci series in that number location from user
        System.out.print("Enter the nth number to find fibonacci in the nth position:\t");
        int n = input.nextInt();

        //starting value of fibonnaci series is 0 we assign it to the variable 'a'
        int a = 0;

        //second value of fibonnaci series is 1 we assign it to the variable 'b'
        int b = 1;

        //Declared count variable to 2 for calculate fibonacci series
        int count = 2;

        while ( count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count += 1;
        }
        System.out.println("Fibonacci is "+ b);
    }
}
