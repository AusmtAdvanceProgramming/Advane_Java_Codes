
package team6.quiz3;

/**
 * @author Mahdi
 * 
 */
import javax.swing.JOptionPane;

public class Q0 {
    public static void main(String[] args) {
        char loop = 'y';
        double number = 0;
        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;
        double sum = 0;

        while (loop == 'y') {
            String input1 = JOptionPane.showInputDialog(null, "Enter your intended number: ", "Number input",JOptionPane.QUESTION_MESSAGE);
            number = Double.parseDouble(input1);

            sum += number;
            if (number >= maximum) {
                maximum = number;
            } 
            if (number <= minimum) {
                minimum = number;
            } 

            String input2 = JOptionPane.showInputDialog(null, "Do you want to continue ?!", "Letter input",
                    JOptionPane.QUESTION_MESSAGE);
            input2 = input2.toLowerCase();
            loop = input2.charAt(0);
        } 

        System.out.println();
        System.out.println("The largest number is " + maximum + "\n");

        System.out.println("The smallest number is " + minimum + "\n" );

        System.out.println("The sum of the numbers is " + sum + "\n");

    }
} 
