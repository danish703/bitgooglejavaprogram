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
public class BankProducer {
  
    public static AbstractBank getBankFactory(String type){
        if(type.equalsIgnoreCase("class a")){
            new ClassABankFactory();
        }else{
            new classBBankFactory();
        }
        return null;
    }
}
