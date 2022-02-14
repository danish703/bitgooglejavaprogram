
package bitgoogle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> country = new ArrayList<>();
        //to add the data to the list [Nepal,]
        country.add("Nepal");
        country.add("China");
        country.add("India");
        country.add("Bhutan");
        System.out.println("Country = "+country);
        List<String> xyz  = new ArrayList<>();
        xyz.add("abc");
        xyz.add("pqr");
        xyz.add("utv");
        System.out.println(xyz);
        country.addAll(xyz);
         System.out.println("Country = "+country);
         System.out.println(country.get(2));
        Iterator<String> iter = country.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        country.set(1,"Hongkong");
        System.out.println(country);
        country.remove(2);
        System.out.println(country);
        System.out.println(country.size());
        Object[] c = country.toArray();
        System.out.println(country.contains("USA"));
        
    }
   
}
