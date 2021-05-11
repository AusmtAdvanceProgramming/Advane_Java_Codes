/*
 * Workshop4_3
 */
package workshop4_3;

/**
 *
 * @author matrix
 */
public class Workshop4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] string0 = new char[5];
        char[] string1;
        
        fillArray(string0);
        System.out.print("Out of  the method:");
        System.out.println(string0);
        
        System.out.print("returned array: ");
        string1 = returnArray(10);
        System.out.print(string1);
    }//end of main() method
    
    
     public static void fillArray(char[] string) {
         for (int i = 0; i < string.length; i++){
             string[i] = (char)('a' + Math.random()* ('z' - 'a' + 1));
             
         }//end for
         
         System.out.print("In Method:");
         System.out.println(string);
         
     }//end of fillArray() method
     
     
      public static char[] returnArray(int nom) {
          char[] string = new char[nom];
          for (int i = 0; i <string.length; i++){
              string[i] = (char)('a' + Math.random()* ('z' - 'a' + 1));
          }//end for
      
    return string;
    
}//end of fillArray() method

}