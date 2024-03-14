import java.util.Scanner;

public class PalindromeString {

    // Program to check string is palindrome
    static boolean checkPalindromeString( String str ){
        char[] strCopy = str.toCharArray();
        int start =  0;
        int end = strCopy.length - 1;
        while ( start < end){
            char temp = strCopy[start];
            strCopy[start] = strCopy[end];
            strCopy[end] = temp;
            start += 1;
            end -= 1 ;
        }
        String reversedString = new String(strCopy);
        for(int ch = 0; ch < str.length(); ch++){
            if(str.charAt(ch) != reversedString.charAt(ch)){
                return false;
            }
        }
        return true;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a string from User
        System.out.print("Enter String:\t");
        String string = input.next();

        if(checkPalindromeString(string)){
            System.out.println("It is Palindrome String");
        }
        else{
            System.out.println("It is not Palindrome String");
        }
    }
}
