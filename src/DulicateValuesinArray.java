import java.util.ArrayList;
import java.util.Scanner;

public class DulicateValuesinArray {
    // Function to find Duplicate elemets in array
    static ArrayList<String> duplicateElemets(String[] arr ){

        ArrayList<String> ans = new ArrayList<>();
        int count = 0;
        for(int i = 0 ; i< arr.length; i++){
            for( int j = i+1; j < arr.length;j++){
                if(arr[i] == arr[j]){
                    ans.add(arr[i]);
                }
                continue;
            }
        }
        return ans;
    }

    //Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"C++","Python","java","C++","Python","javascript","javascript"};

        ArrayList<String> ans = duplicateElemets(arr);

        System.out.println("The duplicate element is "+ ans);
    }
}
