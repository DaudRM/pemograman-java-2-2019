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
public class Manajer extends Employee {
    private long bonus;
    
    public Manajer(String name, String address, long salary) {
        super(name, address, salary);
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary() + getBonus(); //To change body of generated methods, choose Tools | Templates.
    }

}