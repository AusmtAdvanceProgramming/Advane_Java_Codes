package Team6;

    import javax.swing.JOptionPane;

public class Workshop4_2 {
    public static void main(String[] args) {
        
        int arraySize;

        String size = JOptionPane.showInputDialog(null,
                "Please input number of names:",
                "Specifying List size",
                JOptionPane.QUESTION_MESSAGE);

        arraySize = Integer.parseInt(size);

        String[] myList = new String[arraySize];

        for (int i = 0; i < myList.length; i++){

            myList[i] = JOptionPane.showInputDialog(null,String.format("Please input the name #%d: ",i), "#" + i );

        }
        for(int j = 0; j < myList.length; j++ ){
            System.out.println("<< " + myList[j] + " >>");
        }
    }
}
