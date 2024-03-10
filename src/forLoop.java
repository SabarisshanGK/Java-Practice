public class forLoop {
    public static void main(String[] args){
        int num;
        for (num = 1; num < 10; num += 1){
            if(num % 3 == 0)
                continue;
            System.out.println(num);
        }
    }
}
