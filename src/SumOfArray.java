import java.util.Scanner;

public class SumOfArray {
    // Function to find sum of Array
    static int ArraySum( int[] arr ){
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    // Mai FUnction
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get Array Size from User
        System.out.print("Enter the size of an array:\t");
        int size = input.nextInt();

        int[] array = new int[size];

        // Get Array elements from user
        System.out.print("Enter Array Elements:\t");
        for (int i = 0; i<size; i++){
            array[i] = input.nextInt();
        }

        int sum = ArraySum(array);

        System.out.println("The sum is "+sum);
    }
}
