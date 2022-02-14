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
public class BankTest {
    public static void main(String[] args) {
        /*
         1. for nic asia ---> nic
         2. for everest ====> everest
         3. for himalayan ===> himalayan
        */
        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        Bank nicBank =  bankAccountFactory.getBankAccount("nic");
        System.out.println(nicBank);
        
    }
}
