/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz3;

/**
 *
 * @author amirali ghaumi
 * @author naser riazi
 * team3
 * 
 */
public class Q3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
       
        System.out.println("*****************************");
        
        System.out.println("original array order:");
        
        for(int i = 0; i < array.length; i++)
        System.out.println(i + " : " + array[i]);
        
      shuffleArray(array);
        
        System.out.println("**********************************");
        System.out.println("array in shuffle:");
        
        
        for(int i = 0; i < array.length; i++)
        System.out.println(i+" : " + array[i]);
        
        System.out.println("*****************************");
        System.out.println("End of programm.");
    }
    public static void shuffleArray(int[] array1){
        int index1;
        int index2;
        int hold;
          for(int j =0; j < array1.length; j++){
               
              index1 = (int)(Math.random() * array1.length);
              index2 = (int)(Math.random() * array1.length);
              
              hold = array1[index1];
              array1[index1] = array1[index2];
              array1[index2] = hold;
        }
    }//end of shuffle method
    
    
}
