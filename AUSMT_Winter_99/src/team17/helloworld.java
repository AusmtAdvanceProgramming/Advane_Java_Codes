package team17;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("you \tare my sun shine");
        System.err.println("you are my sun shine\b\r");
        System.out.print("\"you are my sun shine\"\n");
        int n=10;
        System.out.format("the number is n=%,8d\n",n);
        System.out.format("the number is n=%+11d\n",n);
        System.out.format("the number is n=%0+,13d\n",n);
        double pi=Math.PI;
        System.out.format("the pi number is:\t%f\n",pi);
        System.out.format("the pi number is:\t%+1.14f\n",pi);
        System.out.format("the pi number is:\t%-1.14f\n",pi);
        byte g=127;   //-128=<byte<=127
        System.out.format("the g is:\t%0+,5d\n",g);
    }
    
}
