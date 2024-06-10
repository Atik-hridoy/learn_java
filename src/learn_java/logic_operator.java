package learn_java;

public class logic_operator {
    public static void main(String[] args) {
        int x = 5;
        int y = 8 ;
        int a = 9 ;
        int b = 3 ;

        boolean result = x > y && a < b;
        boolean result1 = x < y || a < b;
        System.out.println(result);
        System.out.println(result1);
    }

}
