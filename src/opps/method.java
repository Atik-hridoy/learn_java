package opps;


class computer{
    public void playMusic(){
        System.out.println("play music");

    }

    public String giveMePen(int cost){
       // return "pen";

       String result  = (cost >= 10)? "pen" : "nothing";

       return result;
    }
}


public class method {
    public static void main (String arr []){

        computer obj = new computer();
        obj.playMusic();
        String str = obj.giveMePen( 1);

        System.out.println(str);
       
    }

}
