/*team17.Quiz3.Q3
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz3;

public class Q6 {
        public static void main(String[] args) {
            double mean = 0;
            double sum = 0;
            int i,j,k;
        int [] myList = new int[100];
        System.out.println("Random elements generated between 0 and 100 are: ");
        for (i = 0; i < myList.length ; i++) {
         myList[i]=(int)(Math.random()*100);
         sum += myList[i];
         System.out.println(myList[i]);
        }
        mean = sum/100;
        System.out.println("The average of elements is: "+mean);
        System.out.println("Elements larger than average are: ");
        for (j = 0; j < myList.length ; j++) {
            if(myList[j] > mean){
                System.out.println(myList[j]);
            } 
        }
    }//end of main(0 method.
}//end of Class 
