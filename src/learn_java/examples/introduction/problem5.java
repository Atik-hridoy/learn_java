


// Java Program to Compute Quotient and Remainder



package learn_java.examples.introduction;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
       int b = sc.nextInt();

        System.out.println("enter number a : " + a);
        System.out.println("enter number b : " + b);


        int qoutient = a / b ;
        int remainder = a % b;

        System.out.println(" the qoutient is : " + qoutient);
        System.out.println(" the remainder is : " + remainder);
    }

}
/* 
enter number a : 55
enter number b : 4
 the qoutient is : 13
 the remainder is : 3
 */
