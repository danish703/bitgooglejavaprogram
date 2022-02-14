package bitgoogle;

import java.io.FileInputStream;
public class FileInputStreamDemo {
    
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\myfile.txt");
            int i;
            while((i=fin.read())!=-1){
              System.out.print((char)i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
