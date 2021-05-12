
package team6.quiz3;

/**
 * @author Mahdi
 * 
 */
import javax.swing.JOptionPane;


public class Q4 {
  
  public static int binarySearch(int[] array, int number,int low,int high){
    int middle;
    
    while(low <= high){
        middle =(low + high) / 2;
        if(number == array[middle]){
            return middle;
            }
        
        else if (number < array[middle])
            high = middle - 1;
        
        else  
            low = middle + 1; 
    }
    return -1;
  } 

    public static void main(String[] args) {
      int arraySize = 100;
      int[] array = new int[arraySize];
      int number = 0, result = 0, hold = 0;
      
      //giving value
      for (int i = 0; i < arraySize; i++){
          array[i] = (int)(Math.random() * 101);
      }
              
      //for orgenizing
      for (int j = 0; j < arraySize -1; j++){
          
          for(int i = 0; i < arraySize -1;i++){
              
              if(array[i] > array[i + 1]){
                  hold = array[i];
                  array[i] = array[i+1];
                  array[i+1] = hold;
              }
          }
      }

      String input = JOptionPane.showInputDialog(null, "Enter your intended number: ", "Number search",JOptionPane.QUESTION_MESSAGE);
      number = Integer.parseInt(input);

      result = binarySearch(array, number, 0, arraySize - 1);
      
if (result == -1){
              for(int i = 0; i < array.length; i++){
              if ( i % 10 == 0){
                  System.out.println();
              }
              System.out.print(array[i] + "\t");
              
          }
              System.out.println("\n*** " + number + " was not found in array ***");
      }
      
      else{
              for(int i = 0; i < array.length; i++){
              if ( i % 10 == 0){
                  System.out.println();
              }
              System.out.print(array[i] + "\t");
              
          }
              int place;
              place = result +1;       
              System.out.println("\n\n*** " + number + " was found in index " + place + " ***");
      } 
      System.out.println();
      System.out.println("Done.");

  }
  
}
