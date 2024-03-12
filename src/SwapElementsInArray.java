import java.util.Arrays;

public class SwapElementsInArray {
    // Swap Function
    static void swap( int[] arr , int index1 , int index2 ){
        int temp = arr[index1];
        arr[index1]  = arr[index2];
        arr[index2] = temp;
    }

    // Main Function
    public static void main(String[] args) {
        int[] array = {1,9,8,3,4};

        System.out.println(Arrays.toString(array));

        swap(array,0,4);

        System.out.println(Arrays.toString(array));
    }
}
