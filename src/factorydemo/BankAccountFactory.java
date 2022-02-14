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
public class BankAccountFactory {
    
    public Bank getBankAccount(String bankName){ 
        if(bankName == null){
            return null;
        }else if(bankName.equalsIgnoreCase("NIC")){
            return new NICASIABANK();
        }else if(bankName.equalsIgnoreCase("Himalyan")){
            return new HimalyanBank();
        }else if(bankName.equalsIgnoreCase("Everest")){
            return new EverestBank();
        }
       return null; 
    }
    
}
