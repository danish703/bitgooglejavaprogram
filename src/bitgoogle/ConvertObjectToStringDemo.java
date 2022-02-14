/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitgoogle;

public class ConvertObjectToStringDemo {
    
    public static void main(String[] args) {
        Employee e = new Employee("ram kumar","kc");
        String e1 = e.toString();
        System.out.println(e);
        String e2  = String.valueOf(e);
        System.out.println(e2);
    }
    
}
