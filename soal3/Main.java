/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

/**
 *
 * @author OWNER Daud Ramdan Maulana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manajer bos = new Manajer("Willy", "Gerkalong", 7000000);
        Staff staff1 = new Staff("Ijul", "Ciumbuleuit", 4000000);
        Staff staff2 = new Staff("Dimas", "Lembang", 3700000);
        
        bos.setBonus(8000000);
        System.out.println("Nama Manajer   : " + bos.getName());
        System.out.println("Alamat Manajer : " + bos.getAddress());
        System.out.println("Gaji Manajer   : " + bos.getSalary());
        
       
        System.out.println("Nama staff1   : " + staff1.getName());
        System.out.println("Alamat staff1 : " + staff1.getAddress());
        System.out.println("Gaji staff1   : " + staff1.getSalary());
        
        
        System.out.println("Nama staff2   : " + staff2.getName());
        System.out.println("Alamat staff2 : " + staff2.getAddress());
        System.out.println("Gaji staff2   : " + staff2.getSalary());
        
    }
    
    
}
