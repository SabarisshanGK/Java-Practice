import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    // Main Function
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        //Initialization
        for (int i =0 ; i < 3 ; i++){
            list.add(new ArrayList<>());
        }

        //Get Array Values from user
        for (int i =0 ; i < 3 ; i++){
            for (int j =0 ;j < 3; j++){
                list.get(i).add(input.nextInt());
            }
        }

        //Display Output
        System.out.println(list);
    }
}
