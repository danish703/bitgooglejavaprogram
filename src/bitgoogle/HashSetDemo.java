/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitgoogle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Dipendra
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<String>(); // set {}
        int l= country.size();
        System.out.println(l);
        //to add the data to set
        country.add("nepal");
        country.add("china");
        country.add("India");
        
        System.out.println(country);
        //country.add("nepal");
        country.add("Bhutan");
        System.out.println(country);
        
        //to remove the data form set
        country.remove("china");
        
        System.out.println(country);
        //to clear all the data
        //country.clear();
        //System.out.println(country);
        country.add("Bhutan");
        System.out.println(country.size());
        country.add("Japan");
        System.out.println(country);
        System.out.println(country.size());
        //to reterive the data we must convert the set into the array list.
        List<String> mycountry = new ArrayList<String>(country);
        System.out.println(mycountry.get(0));
        System.out.println("------------------------");
        for(String c:country){
            System.out.println(c);
        }
        
       
    }
}
