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
public class BankTest {
    public static void main(String[] args) {
        AbstractBank abstractBank = BankProducer.getBankFactory("class a");
        Bank nabil = abstractBank.getBank("nabil");
        Bank evrest = abstractBank.getBank("everest");
        
        AbstractBank abstractBankb = BankProducer.getBankFactory("class b");
        Bank jyoti = abstractBankb.getBank("jyoti");
        Bank mukti = abstractBankb.getBank("mukti");
    }
   
}
