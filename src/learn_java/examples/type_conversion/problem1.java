

package learn_java.examples.type_conversion;

import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
        
        // Convert char to String

        char ch = 'a';

        String st = Character.toString(ch);

        System.out.println(st);

        // Convert char array to String

        char [] arr = {'a', 'e', 'i', 'o', 'u'};

        String st2 = new String(arr);
        String st1 = String.valueOf(arr);

        System.out.println(st2);
        System.out.println(st1);

        // Convert String to char array

        String s = "i a,m fine";

        char [] ar = s.toCharArray()    ;

        System.out.println(Arrays.toString(ar));
    }

}
