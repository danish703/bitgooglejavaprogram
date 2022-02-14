/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Dipendra
 */
public class JyotiBikashBank implements Bank {
     
    @Override
    public void createBankAccount() {
        System.out.println("JyotiBikash bank is created");
    }
}
