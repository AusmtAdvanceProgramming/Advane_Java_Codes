/*
* tamrin3_quiz3
*/
import javax.swing.JOptionPane;

public class tamrin3_quiz3 {

    public static void main(String[] args) {
        // 
        int array_size = get_array_size();
        // 
        craete_show_array(array_size);
    }
    // 
    public static int get_array_size() {
        String size = JOptionPane.showInputDialog(null,
            "Enter your lengh of string :",
            "string lengh",
            JOptionPane.QUESTION_MESSAGE);
        int array_size = Integer.parseInt(size);
        return array_size;
    }
    // 
    public static void craete_show_array(int array_size) {
        char[] array = new char[array_size];
        for (int c = 0; c < array_size; c++) {
            int num = ((int) (Math.random() * 100)) % 26;
            switch (num) {
                case 0 :
                    array[c] = 'a';
                    break;
                case 1 :
                    array[c] = 'b';
                    break;
                case 2 :
                    array[c] = 'c';
                    break;
                case 3 :
                    array[c] = 'd';
                    break;
                case 4 :
                    array[c] = 'e';
                    break;
                case 5 :
                    array[c] = 'f';
                    break;
                case 6 :
                    array[c] = 'g';
                    break;
                case 7 :
                    array[c] = 'h';
                    break;
                case 8 :
                    array[c] = 'i';
                    break;
                case 9 :
                    array[c] = 'j';
                    break;
                case 10 :
                    array[c] = 'k';
                    break;
                case 11 :
                    array[c] = 'm';
                    break;
                case 12 :
                    array[c] = 'n';
                    break;
                case 13 :
                    array[c] = 'l';
                    break;
                case 14 :
                    array[c] = 'o';
                    break;
                case 15 :
                    array[c] = 'p';
                    break;
                case 16 :
                    array[c] = 'q';
                    break;
                case 17 :
                    array[c] = 'r';
                    break;
                case 18 :
                    array[c] = 's';
                    break;
                case 19 :
                    array[c] = 't';
                    break;
                case 20 :
                    array[c] = 'u';
                    break;
                case 21 :
                    array[c] = 'v';
                    break;
                case 22 :
                    array[c] = 'w';
                    break;
                case 23 :
                    array[c] = 'x';
                    break;
                case 24 :
                    array[c] = 'y';
                    break;
                case 25 :
                    array[c] = 'z';
                    break;
            }
        }
        for (int a = 0; a < array_size; a++) {
            System.out.print(array[a]);
        }
    }
}