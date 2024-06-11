package learn_java.examples.introduction;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        

        

        System.out.println("Enter the number 1 : " + n1);
       


        String result = (n1 % 2 == 0)? "Even": "odd";

        System.out.println(result);
    }

}
/*7
Enter the number 1 :7
odd
 */