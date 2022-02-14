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
public class NicAsiaBank implements Bank{

    @Override
    public void createBankAccount() {
        System.out.println("Nic Asia bank is created");
    }
}
