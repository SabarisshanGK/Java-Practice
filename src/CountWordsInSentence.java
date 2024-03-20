import java.util.Scanner;

public class CountWordsInSentence {
    // Function to find number of words in a Sentence
    static int noOfWords( String senetnce ){
        int count = 1;
        for (int i =0; i < senetnce.length();i++){
            if(senetnce.charAt(i) == 32){
                count += 1;
            }
        }
        return count;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get a String From User
        System.out.print("Enter String:\t");
        String sentence = input.nextLine();

        int words = noOfWords(sentence);
        System.out.println("There are "+words+" words in given sentence");
    }
}
