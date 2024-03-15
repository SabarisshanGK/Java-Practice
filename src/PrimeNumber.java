import java.util.Scanner;

public class PrimeNumber {
    // Function to find Prime Number
    static boolean isPrime( int num ){
        int count = 0;
        for( int i = 2; i <= num; i++ ){
            if(num % i == 0){
                count++;
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get Number from User
        System.out.print("Enter Number:\t");
        int num = input.nextInt();

        if(isPrime(num)){
            System.out.println("It is a Prime Number!!!");
        }
        else {
            System.out.println("Sorry It is not a prime number!!!!");
        }
    }
}
