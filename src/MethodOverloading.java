import java.util.Arrays;

public class MethodOverloading {
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String s){
        System.out.println(s);
    }

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }

    // MAin Function
    public static void main(String[] args) {
        fun(1);
        fun("Sabarisshan");
        fun(1,1,2,3,4,4,5);
    }
}
