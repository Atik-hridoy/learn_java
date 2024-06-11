package learn_java.other;
import javax.swing.plaf.synth.SynthStyle;

public class conditionExample {
 public static void main (String []arr){

    int a = 20;

    if ( a<20){
        System.out.println("yes, big");
    }
    else{
        System.out.println("no, small");
    }

    int b = 100;

    if (b > 91) 
    {
        System.out.println("Grade A");
    }
    else if (b >=80 && b <=89) {
        System.out.println("Grade B");
        
    }
    else {
        
        System.out.println("fail");
    }

    int c = 100;

    if (c % 2 == 0){
     System.out.println("even");

    }
    else{
        System.out.println("odd");
    }

    String day = "Wed";

    switch (day) {
        case "Sat":{
            System.out.println("yes it is Sat");
        }
            
            break;

        case "Mon" :{
            System.out.println(day);

        }   
        break;
    
        default:{
            System.out.println("no days found");
        }
            break;
    }

 }
}
