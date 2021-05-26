/*team17.Quiz3.Q4
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz3;
//shuffling array...
public class Q4 {
      public static void main(String[] args) {
        int arr[] = {(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),
          (int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)};
        System.out.println("Randomly array is: ");

        for(int i = 0; i < arr.length; i++)
        System.out.println("Index of "+i + " : " + arr[i]);
      //Call shuffling() method.
      shuffling(arr);
        System.out.println("Shuffled array is: ");
        for(int i = 0; i < arr.length; i++)
        System.out.println("Index of "+i+" : " + arr[i]);
    }//end of main() method.
    public static void shuffling(int[] Array){
        int randIndex1;
        int randIndex2;
        int store;
          for(int j =0; j < Array.length; j++){

              randIndex1 = (int)(Math.random() * Array.length);
              randIndex2 = (int)(Math.random() * Array.length);

              store = Array[randIndex1];
              Array[randIndex1] = Array[randIndex2];
              Array[randIndex2] = store;
        }
    }//end of shuffle method
}//end of Class