package opps;

class calculator{

    int c ;

    public int add(int a, int b){
        //System.out.println("just add");
        
        int r = a+b;

        return r;
    }

}

public class class_object {
    public static void main (String arr []){
        int a = 7;
        int b = 8;

        //int result =( a+b ) ;
        //System.out.println(result);

        calculator cal = new calculator();

        int result = cal.add(a,b);

        System.out.println(result);


    }

}
