package soal1;

import java.util.Scanner;

/**
 *
 * @author OWNER Daud Ramdan Maulana
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in); 

        int lingkaran1;
        int lingkaran2;
        double luas1, luas2;
        
        System.out.println("Jari Jari lingkaran 1   =   ");
        lingkaran1 = s.nextInt();
        luas1 = 3.14 * lingkaran1 * lingkaran1;
        
        System.out.println("Jari Jari lingkaran 2   =   ");
        lingkaran2 = s.nextInt();
        luas2 = 3.14 * lingkaran2 * lingkaran2;
        
       
        System.out.println("Luas Lingkaran  1 =   " +luas1);
        System.out.println("Luas Lingkaran  2 =   " +luas2);
        
      
        if(lingkaran1 > lingkaran2){
             System.out.println("Lingkaran2 didalam Lingkaran1");
        }else {
            System.out.println("Lingkaran1 didalam Lingkaran2");
        }
       
    }
     
}
