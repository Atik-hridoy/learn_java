


// Java Program to Swap Two Numbers


package learn_java.examples.introduction;
import java.util.Scanner;

public class problem6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        System.out.println("Enter the number 1 :" + n1);
        System.out.println("Enter the number 2 :" + n2);


       // float temp = n1;

       // n1 = n2 ;

       // n2 = temp;

       n1 = n1 - n2;  // 6-5 = 1
       n2 = n1 + n2;  // 1+5 = 6
       n1 = n2 - n1;  // 6-1 = 5


        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
        
    }

}

/*
6
5
Enter the number 1 :6.0
Enter the number 2 :5.0
First number = 5.0
Second number = 6.0
 */
