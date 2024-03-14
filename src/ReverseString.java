import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    // Function to reverse a string
    static char[] reverseString( String str){
        int start = 0;
        int end = str.length() -1;
        char[] strCopy = str.toCharArray();
        while( start < end ){
            char temp = strCopy[start];
            strCopy[start] = strCopy[end];
            strCopy[end]= temp;
            start += 1;
            end -=1;
        }
        return  strCopy;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get String from User
        System.out.print("Enter String:\t");
        String str = input.next();


        System.out.println("String Before:\t"+str);
        char[] reverseCharArray = reverseString(str);
        String reversed = new String(reverseCharArray);

        System.out.println("String After:\t"+ reversed);

    }
}
