import java.util.ArrayList;
import java.util.Scanner;

public class SeperateEvenOddNumbersFromArray {
    // Function to seperate Even Numbers
    static ArrayList<Integer> EvenNumbersArray(int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }
        }
        return even;
    }

    // Function to seperate odd Numbers
    static ArrayList<Integer> OddNumbersArray(int[] arr){
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                odd.add(arr[i]);
            }
        }
        return odd;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        // get array elements from user
        System.out.print("Enter Array Elements:\t");
        for (int i = 0; i < 6; i++){
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> oddArrayList = OddNumbersArray(arr);
        ArrayList<Integer> evenArrayList = EvenNumbersArray(arr);

        System.out.println("Odd Elements in given Array:\t"+oddArrayList);
        System.out.println("Even Elements in given Array:\t"+evenArrayList);
    }

}
