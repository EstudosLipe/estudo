import java.util.Scanner;

public class Bee1015 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double pontos[] = new double[4], res = 0;

        for (int i = 0; i < pontos.length; i++) {
            pontos[i] = sc.nextDouble();
        }

        res = Math.pow(Math.pow(pontos[2] - pontos[0],2) + Math.pow(pontos[3] - pontos[1],2),0.5);
        System.out.println(String.format("%.4f", res));
        sc.close();
    }
}
