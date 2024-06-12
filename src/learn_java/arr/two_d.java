package learn_java.arr;

import java.util.Scanner;

public class two_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt(); 

        int nums [][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        for (int[] a : nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
