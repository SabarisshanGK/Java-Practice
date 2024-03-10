import java.util.Scanner;

public class WeekdayOrWeekendProgram {

    //Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day = input.next().trim();
        switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It's a week day");
            case "Saturday","Sunday" -> System.out.println("It's a WeekEnd!");
        }
    }
}
