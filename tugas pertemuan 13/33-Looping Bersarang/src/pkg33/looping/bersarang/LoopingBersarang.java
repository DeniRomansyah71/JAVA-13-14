/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg33.looping.bersarang;

/**
 * Nama : Deni Romansyah
 * NIM  : A2.1900043
 * Kelas: TI-1C
 */
public class LoopingBersarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // looping bersarang

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if ( (i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ( (i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
