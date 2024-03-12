import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberInAnArray {
    // Swap function
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Reverse Function
    static void reverseAnArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end ){
            swap(arr,start,end);
            start += 1;
            end -=1;
        }

    }

    //Main Function
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array elements:\t");
        for(int i =0 ; i<6;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Array before Reverse:\t"+Arrays.toString(arr));

        reverseAnArray(arr);

        System.out.println("Array after Reverse:\t"+Arrays.toString(arr));

    }
}
