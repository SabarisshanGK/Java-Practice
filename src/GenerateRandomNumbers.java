import java.util.Random;

public class GenerateRandomNumbers {
    // main function
    public static void main(String[] args) {
        Random rand_num = new Random();
        int num = rand_num.nextInt(1000);
        System.out.println(num);
    }
}
