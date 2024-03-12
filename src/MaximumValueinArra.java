import java.util.Scanner;

public class MaximumValueinArra {
    // Marximum finding Function
    static int maximum( int[] arr){
        int max = arr[0];
        for (int i = 0; i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Main Funcion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        //Get Array values from user
        for (int i = 0; i< 5;i++){
            arr[i] = input.nextInt();
        }

        int maximumValue = maximum(arr);

        System.out.println("The maximum value in given array is\t"+maximumValue);
    }

}
