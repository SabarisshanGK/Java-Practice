import java.util.Scanner;

public class AlphabetCaseCheck {
    // FUnction to check whether entered character is lowercase
    public static boolean isLower(char ch){
        if( ch >= 97 && ch <= 122)
            return true;
        else
            return false;
    }

    //Function to check whether entered character is uppercase
    public static boolean isUpper(char ch){
        if( ch >= 65 && ch <= 90)
            return  true;
        else
            return false;
    }

    //Main function
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Get character from User
        System.out.print("Enter character to check its alphabet case:\t");
        char character = input.next().trim().charAt(0);

        if(isLower(character)){
            System.out.println("You have entered a lowercase character");
        }
        else if(isUpper(character)){
            System.out.println("You have entered an uppercase character");
        }
        else {
            System.out.println("You have entered special character");
        }
    }
}
