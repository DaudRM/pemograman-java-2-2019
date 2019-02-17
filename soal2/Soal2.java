package soal2;

import java.util.Scanner;



/**
 *
 * @author OWNER Daud Ramdan Maulana
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int jumlah_bilangan = 8;
        
        int bilangan[] = new int[jumlah_bilangan];
        System.out.println("ketiklah 8 bilangannya  :");
    
        
        for (int a = 0; a < jumlah_bilangan; a++){
            bilangan[a] = s.nextInt();
        }
        s.close();
    
        
        for (int b = 0; b < jumlah_bilangan - 1; b++) {
        for (int a = 0; a < jumlah_bilangan - 1; a++) {
            if (bilangan[a] < bilangan[a + 1]){
                int c = bilangan[a];
                bilangan[a] = bilangan[a + 1];
                bilangan[a + 1] =c;
            }
        }
    }
        System.out.println("jawabanya 3 bilangan terbesar : ");
        System.out.print(bilangan[0] + "," + bilangan[1] + "," + bilangan[2]);
    }
   
}
