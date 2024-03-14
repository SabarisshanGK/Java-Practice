import java.util.Scanner;

public class FibonacciSeries {
    // Function to find Fibonacci number
    static  void Fibonacci( int num ){
        int a = 0;
        int b = 1;
        int count =2;
        System.out.print(a+" "+b);
        while (count<num){
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(" "+b);
            count += 1;
        }
            }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get length from user
        System.out.print("Enter length:\t");
        int length = input.nextInt();

        Fibonacci(length);
    }
}
