import java.util.Arrays;

public class VarArgs {
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // Main Function
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
    }
}
