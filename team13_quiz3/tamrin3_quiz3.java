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
            int num_1 = ((int) (Math.random() * 1000)) % 35;
            int num_2 = ((int) (Math.random() * 10)) % 2;
            switch (num_1) {
                case 0 :
                    if (num_2 == 1) {
                        array[c] = 'a';
                    }
                    else {
                        array[c] = 'A';
                    }
                    break;
                case 1 :
                    if (num_2 == 1) {
                        array[c] = 'b';
                    }
                    else {
                        array[c] = 'B';
                    }
                    break;
                case 3 :
                    if (num_2 == 1) {
                        array[c] = 'c';
                    }
                    else {
                        array[c] = 'C';
                    }
                    break;
                case 4 :
                    if (num_2 == 1) {
                        array[c] = 'd';
                    }
                    else {
                        array[c] = 'D';
                    }
                    break;
                case 5 :
                    if (num_2 == 1) {
                        array[c] = 'e';
                    }
                    else {
                        array[c] = 'E';
                    }
                    break;
                case 6 :
                    if (num_2 == 1) {
                        array[c] = 'f';
                    }
                    else {
                        array[c] = 'F';
                    }
                    break;
                case 7 :
                    if (num_2 == 1) {
                        array[c] = 'g';
                    }
                    else {
                        array[c] = 'G';
                    }
                    break;
                case 8 :
                    if (num_2 == 1) {
                        array[c] = 'h';
                    }
                    else {
                        array[c] = 'H';
                    }
                    break;
                case 9 :
                    if (num_2 == 1) {
                        array[c] = 'i';
                    }
                    else {
                        array[c] = 'I';
                    }
                    break;
                case 10 :
                    if (num_2 == 1) {
                        array[c] = 'j';
                    }
                    else {
                        array[c] = 'J';
                    }
                    break;
                case 11 :
                    if (num_2 == 1) {
                        array[c] = 'k';
                    }
                    else {
                        array[c] = 'K';
                    }
                    break;
                case 12 :
                    if (num_2 == 1) {
                        array[c] = 'm';
                    }
                    else {
                        array[c] = 'M';
                    }
                    break;
                case 13 :
                    if (num_2 == 1) {
                        array[c] = 'n';
                    }
                    else {
                        array[c] = 'N';
                    }
                    break;
                case 14 :
                    if (num_2 == 1) {
                        array[c] = 'o';
                    }
                    else {
                        array[c] = 'O';
                    }
                    break;
                case 15 :
                    if (num_2 == 1) {
                        array[c] = 'p';
                    }
                    else {
                        array[c] = 'P';
                    }
                    break;
                case 16 :
                    if (num_2 == 1) {
                        array[c] = 'q';
                    }
                    else {
                        array[c] = 'Q';
                    }
                    break;
                case 17 :
                    if (num_2 == 1) {
                        array[c] = 'r';
                    }
                    else {
                        array[c] = 'R';
                    }
                    break;
                case 18 :
                    if (num_2 == 1) {
                        array[c] = 's';
                    }
                    else {
                        array[c] = 'S';
                    }
                    break;
                case 19 :
                    if (num_2 == 1) {
                        array[c] = 't';
                    }
                    else {
                        array[c] = 'T';
                    }
                    break;
                case 20 :
                    if (num_2 == 1) {
                        array[c] = 'u';
                    }
                    else {
                        array[c] = 'U';
                    }
                    break;
                case 21 :
                    if (num_2 == 1) {
                        array[c] = 'v';
                    }
                    else {
                        array[c] = 'V';
                    }
                    break;
                case 22 :
                    if (num_2 == 1) {
                        array[c] = 'w';
                    }
                    else {
                        array[c] = 'W';
                    }
                    break;
                case 23 :
                    if (num_2 == 1) {
                        array[c] = 'x';
                    }
                    else {
                        array[c] = 'X';
                    }
                    break;
                case 24 :
                    if (num_2 == 1) {
                        array[c] = 'y';
                    }
                    else {
                        array[c] = 'Y';
                    }
                    break;
                case 25 :
                    if (num_2 == 1) {
                        array[c] = 'z';
                    }
                    else {
                        array[c] = 'Z';
                    }
                    break;
                case 26 :
                    array[c] = '1';
                    break;
                case 27 :
                    array[c] = '2';
                    break;
                case 28 :
                    array[c] = '3';
                    break;
                case 29 :
                    array[c] = '4';
                    break;
                case 30 :
                    array[c] = '5';
                    break;
                case 31 :
                    array[c] = '6';
                    break;
                case 32 :
                    array[c] = '7';
                    break;
                case 33 :
                    array[c] = '8';
                    break;
                case 34 :
                    array[c] = '9';
                    break;
            }
        }
        for (int a = 0; a < array_size; a++) {
            System.out.print(array[a]);
        }
    }
}