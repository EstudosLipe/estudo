import java.util.Scanner;

public class Bee1011 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double consta = 4.0/3.0, PI = 3.14159;
        int raio = sc.nextInt();

        System.out.println("VOLUME = "+String.format("%.3f", (consta*PI*Math.pow(raio, 3))));

        sc.close();
    }
}
