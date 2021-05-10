package team17;

import javax.swing.JOptionPane;

/*team17.Workshop4_2
Salari & Sh'abani
@Author : Salari
example(2).V.Khazaeinezhad_JAVA_Lecture_0_7*/

public class Workshop4_2 {
    public static void main(String[] args) {
        int arraySize;
        String size = JOptionPane.showInputDialog(null, //Parent of dialog box.
                "Please enter number of names:", //Input message.
                "Specifying List Size", //Input title.
                JOptionPane.QUESTION_MESSAGE); //Message type.
        arraySize = Integer.parseInt(size);
        String[] myList = new String[arraySize];
        for(int i = 0; i < myList.length; i++){
            myList[i] = JOptionPane.showInputDialog(null,
                    String.format("Please enter the name #%d:",i),
                    "#" + i);
        }//end of 1st for() loop.
        for(int i=0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }//end of 2nd for() loop.
    }//end of main() method    
}//end of Class