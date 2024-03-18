import java.util.Arrays;

public class DeleteSpecialCharactersFromString {
    // Function to Delete Special characters
    static String RemoveCharacters(String str){
        String result ="";
        for (int i =0;i<str.length();i++){
            if(str.charAt(i)>64 && str.charAt(i)<=122){
                result += str.charAt(i);
            }
        }
        return result;
    }

    //Main Function
    public static void main(String[] args) {
        String str = "GSD*SD#";

        String result = RemoveCharacters(str);

        System.out.println("ANsweris:\t"+result);
    }
}
