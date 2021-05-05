package team17;

import javax.swing.JOptionPane;

/*team17.Workshop4_1
Salari & Sh'abani
@Author : Salari
example(1).V.Khazaeinezhad_JAVA_Lecture_0_7*/

public class Workshop4_1 {
    public static void main(String[] args) {
        int arraySize;
        String size = JOptionPane.showInputDialog("Please enter an array size: ");
        arraySize = Integer.parseInt(size);
        int[] myList = new int [arraySize];
        for(int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
            
        }//end of 1st for() loop.
        for(int i=0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }//end of 2nd for() loop.
    }//end of main() method 
}//end of Class