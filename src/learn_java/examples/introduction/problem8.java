

//  Check whether an alphabet is vowel or consonant using switch statement


package learn_java.examples.introduction;

public class problem8 {

    public static void main(String[] args) {
        char ch = 'f';

       // String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')? "Vowel" : "Constant";

       //  System.out.println(result);

       switch (ch) {
        case 'a':
        case 'e': 
        case 'i':  
            System.out.println(ch + "is Voawel");
            
       
        default:
        System.out.println(ch +" is constant");
            break;
       }



    }

}
