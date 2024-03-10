public class IfElseConditionalStatementExample {
    public static void main(String[] args) {
        int salary = 6000;
        if(salary > 20000){
            salary += 10000;
        }
        else {
            salary -= 5000;
        }
        System.out.println(salary);
    }
}
