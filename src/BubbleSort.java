import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    // Function to swap
    static void swapNumber( int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // Function to sort Arrays using bubblesort Algorithm
    static void bubbleSortAlgorithm(int[] arr){
        for(int i = 0; i< arr.length;i++){
           for(int j =1 ;j<=arr.length-1;j++){
               if(arr[j-1] >arr[j]){
                   swapNumber(arr,i,j);
               }
           }

        }
        System.out.println("Array after Sort:\t"+ Arrays.toString(arr));
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get Array size
        System.out.print("Enter Array Size:\t");
        int size = input.nextInt();

        int[] array = new int[size];

        //Get array elements
        System.out.print("Enter Array Elements:\t");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        System.out.println("Array before Sort:\t"+ Arrays.toString(array));

        bubbleSortAlgorithm(array);
    }
}
