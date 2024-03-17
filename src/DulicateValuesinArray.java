import java.util.Scanner;

public class DulicateValuesinArray {
    // Function to find Duplicate elemets in array
    static String duplicateElemets( String[] arr ){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return  "";
    }

    //Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"C++","C++","Python","java","JavaScript"};

        String ans = duplicateElemets(arr);

        System.out.println("The duplicate element is "+ ans);
    }
}
