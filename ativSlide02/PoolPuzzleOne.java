/*Falta terminar */

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0 ;

        while (x < 4){
            System.out.print("a");
            
            if (x < 1){
                System.out.print(" ");      //a noise- feito   
            }                                       
            x = x + 1;
            // X == 1
            if (x > 1){
                System.out.println("annoys");
                x = x - 1;
                // X == 0
            } 
                       
            if (x == 1){
                System.out.println("noise"); // feito
            }
            if (x > 3){
                System.out.print("oyster");
            }
            System.out.println();
            x = x + 2;
            //X == 3
        }
    }
}