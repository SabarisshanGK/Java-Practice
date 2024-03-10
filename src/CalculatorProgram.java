import java.util.Scanner;

public class CalculatorProgram {

    //Function for adding two numbers
    public static  int add( int num1 , int num2){
        return num1 + num2;
    }

    // Function for subtracting two numbers
    public static int subtract( int num1 , int num2){
        return  num1 - num2;
    }

    // Function for multiplication
    public static int multiply( int num1 , int num2){
        return  num1 * num2;
    }

    // Function for Divide two numbers
    public static int divide( int num1 , int num2){
        return num1 / num2;
    }

    // Function to find reminder
    public  static  int modulo( int num1, int num2){
        return num1 % num2;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter Operand:\t");
            char ch = input.next().trim().charAt(0);
            int ans = 0;

            if( ch == '+' || ch == '-' || ch == '*' || ch =='%' || ch == '/'){
                // Get two numbers
                System.out.print("Enter number1:\t");
                int num1 = input.nextInt();
                System.out.print("Enter number2:\t");
                int num2 = input.nextInt();

                switch (ch){
                    case '+': ans = add(num1,num2);
                              System.out.println("The answer is:\t"+ans);
                              break;
                    case '-': ans = subtract(num1,num2);
                              System.out.println("The answer is:\t"+ans);
                              break;
                    case '*': ans = multiply(num1,num2);
                              System.out.println("The answer is:\t"+ans);
                              break;
                    case '/': ans = divide(num1,num2);
                              System.out.println("The answer is:\t"+ans);
                              break;
                    case '%': ans = modulo(num1,num2);
                              System.out.println("The answer is:\t"+ans);
                              break;
                    default:
                        System.out.println("Operator doesnot exist");
                        break;
                }

            }
            else if( ch == 'x' || ch == 'X' ){
                break;
            }
            else {
                System.out.println("Invalid Operation");
            }
        }
    }

}
