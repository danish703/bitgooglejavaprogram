/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import factorydemo.BankAccountFactory;

/**
 *
 * @author Dipendra
 */
public class classBBankFactory extends AbstractBank {
    public Bank getBank(String name){
        if(name.equalsIgnoreCase("Jyoti")){
            return new JyotiBikashBank();
        }else if (name.equalsIgnoreCase("gandaki")){
            return new GandakiBikash();
        }else if(name.equalsIgnoreCase("mukti")){
            return new MuktiNathBikashBank();
        }else{
            return null;
        }
    }
    
}
