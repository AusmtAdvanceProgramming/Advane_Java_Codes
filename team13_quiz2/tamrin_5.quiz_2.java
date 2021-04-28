/* team 16 
*  quiz 2
*  parvin akbari
*  amir hosein abdolahi
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("prim numbers");
        int number_of_aval = 1;
        int number_of_adad = 1;
        while (number_of_aval <= 40) {
            int x = 0;
            int y = 0;
            for (int a = number_of_adad; a > 0; a--) {
                if (number_of_adad % (number_of_adad - y) == 0) {
                    x++;
                }
                y++;
            }
            if (x == 2) {
                System.out.print(number_of_adad);
                if (number_of_adad < 10) {
                    System.out.print("  |");
                }
                else if (number_of_adad < 100) {
                    System.out.print(" |");
                }
                else if (number_of_adad < 1000) {
                    System.out.print("|");
                }
                if (number_of_aval % 5 == 0) {
                    System.out.print("\n");
                }
                number_of_aval++;
            }
            number_of_adad++;
        }
    }
}
