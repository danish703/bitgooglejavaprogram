/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydemo;

/**
 *
 * @author Dipendra
 */
public class EverestBank implements Bank {

    @Override
    public void createBankAccount() {
         System.out.println("Bank account at Everest bank is created");
    }
    
}
