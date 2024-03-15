import java.util.Scanner;

public class CheckEqualArrays {
    // Function to check both arrays are equal
    static boolean isEqualArray(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[i]){
                if(i == arr1.length-1){
                    return true;
                }
                else continue;
            }

        }
        return false;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get Size of array 1 from User
        System.out.print("Enter size of Array 1:\t");
        int size1 = input.nextInt();

        int[] arr1 = new int[size1];

        //Get Array 1 values
        System.out.print("Enter Elements of Array 1:\t");
        for (int i = 0; i < size1; i++){
            arr1[i] = input.nextInt();
        }

        // Get size of Array 2
        System.out.print("Enter size of Array 2:\t");
        int size2 = input.nextInt();

        int[] arr2 = new int[size2];

        //Get Array 2 values
        System.out.print("Enter Elements of Array 2:\t");
        for (int i = 0; i < size2; i++){
            arr2[i] = input.nextInt();
        }
        if(isEqualArray(arr1,arr2)){
            System.out.println("Both are equal arrays!!!");
        }
        else {
            System.out.println("Sorry, Both are not equal arrays!!!");
        }
    }
}
