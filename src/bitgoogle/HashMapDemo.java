/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitgoogle;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dipendra
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //creating the map using hashmap
        Map<String,Integer> productPrice = new HashMap<>();
        //data insert
        productPrice.put("apple",200);
        System.out.println(productPrice);
        Map<String,Integer> cloth = new HashMap<>();
        cloth.put("pant",2000);
        cloth.put("tshirt",900);
        productPrice.putAll(cloth);
        productPrice.putIfAbsent("orange",3333);
        //value reterival
        int a = productPrice.get("apple");
        System.out.println(a);
        System.out.println(productPrice);
        System.out.println(productPrice.get("orange"));
        //default value 
        System.out.println(productPrice.get("banana"));
        System.out.println(productPrice.getOrDefault("orange",10));
        System.out.println(productPrice.getOrDefault("banana",100));
        
        //check the key
        System.out.println(productPrice.containsKey("apple"));
        System.out.println(productPrice.containsKey("banana"));
        
        //check the value
        System.out.println(productPrice.containsValue(3333));
        System.out.println(productPrice.containsValue(9999));
        
        //replace
        productPrice.replace("apple",400);
        System.out.println(productPrice);
        productPrice.replace("apple",500,700);
        System.out.println(productPrice);
        //remove 
        productPrice.remove("apple");
        System.out.println(productPrice);
        productPrice.remove("orange",3333);
        System.out.println(productPrice);
        
        //key sets
        System.out.println(productPrice.keySet());
        //values
        System.out.println(productPrice.values());
        
        //entery set
        System.out.println(productPrice.entrySet());
        
    }
   
}
