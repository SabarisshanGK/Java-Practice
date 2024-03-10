public class MultipleIfElseStatement {
    public static void main(String[] args){
        int salary = 5000;

        if(salary > 20000){
            salary += 5000;
        }
        else if( salary >= 10000){
            salary -= 5000;
        }
        else{
            salary -= 1000;
        }

        System.out.println(salary);
    }
}
