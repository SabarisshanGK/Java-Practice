import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Get three numbers from user
        System.out.print("Enter first number:\t");
        int a = input.nextInt();
        System.out.print("Enter second number:\t");
        int b = input.nextInt();
        System.out.print("Enter third number:\t");
        int c = input.nextInt();

        // Assigning first number as default largest number
        int max = a;

        // Find the largest among three numbers
        if( b > max ){
            max = b;
        }
        else if( c > max){
            max = c;
        }

        //Printing which is largest numbers in user inputs
        System.out.println("The largest number is "+ max);
    }
}
