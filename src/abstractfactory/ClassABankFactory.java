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
public class ClassABankFactory extends AbstractBank {

    @Override
    public Bank getBank(String bankName) {
       if(bankName.equalsIgnoreCase("nic")){
           return new NicAsiaBank();
       }else if(bankName.equalsIgnoreCase("everest")){
           return new EverestBank();
       }else if(bankName.equalsIgnoreCase("nabil")){
           return new Nabil();
       }else{
           return null;
       }
    }
    
}
