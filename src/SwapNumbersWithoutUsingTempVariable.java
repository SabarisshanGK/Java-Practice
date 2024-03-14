import java.util.Scanner;

public class SwapNumbersWithoutUsingTempVariable {
    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Get Value of number1 from User
        System.out.print("Enter A:\t");
        int a = input.nextInt();

        // Get Value of number2 from User
        System.out.print("Enter B:\t");
        int b = input.nextInt();

        System.out.println("Numbers before swapping: "+a+" , "+b);

        a=  a + b;
        b=  a - b;
        a= a - b;

        System.out.println("Numbers after swapping: "+a+" , "+b);

    }
}
