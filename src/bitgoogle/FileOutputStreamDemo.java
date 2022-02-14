
package bitgoogle;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("D:\\myfle.txt");
            String mytext = "Hello Java programmer";
            byte[] bytetext = mytext.getBytes();
            fout.write(bytetext);
            fout.close();
        }catch(Exception ex){
         System.out.println(ex);
        }
    }
}
