import java.util.Scanner;

public class NumberOccurenceCount {
    public static int numberOfOccurences(long num, int n){
        int count = 0;
        while (num > 0){
            if( num % 10 == n)
                count += 1;
            num = num/10;
        }
        return  count;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a number
        System.out.print("Enter number:\t");
        long num = input.nextLong();

        //Get a number to find its number of occurrences in that number
        System.out.print("Enter a number to find its occurrences:\t");
        int n = input.nextInt();

        int count = numberOfOccurences(num,n);

        // Print Output
        System.out.println("The number "+ n +" occurred "+ count+ " times in the given number");
    }
}
