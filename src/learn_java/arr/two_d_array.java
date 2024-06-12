package learn_java.arr;

public class two_d_array {
    public static void main(String[] args) {
        int nums [][] = new int [4][6];  // initial size

        //loop for taking input

        for (int i = 0; i < 4; i++){ 
            for (int j = i; j < 6; j++){
                nums [i][j] = (int)( Math.random()*10);
                System.out.println(nums [i][j]);
            }


            
        }
        // loop for print
        
        for ( int n []: nums){
            for (int m : n){
                System.out.print(m+" ");
            }
            System.out.println();

        }
    }

}
