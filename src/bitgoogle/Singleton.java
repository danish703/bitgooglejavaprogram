
package bitgoogle;

public class Singleton {
  private static Singleton obj1 = new Singleton();
  
  private Singleton(){
  
  }
   
  public static Singleton getSingleTon(){
   return obj1;
  }
      
}
