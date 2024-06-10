package opps;

class calculater{
    public int add(int a, int b){
        return a + b ;
    }

    public int add(int a, int b, int c){
        return a + b + c ;
    }
   
   

}



public class method_overloading {
    public static void main(String[] args) {
        calculater cal = new calculater();

        int r = cal.add(4, 06, 9);
        System.out.println(r);

       //System.out.println( cal.add(4,6));

    }


}
