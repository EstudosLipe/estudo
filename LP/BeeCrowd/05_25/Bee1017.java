import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hrsViagem = sc.nextDouble(), veloMedia = sc.nextDouble();

        System.out.println(String.format("%.3f", (hrsViagem*veloMedia)/12));
        sc.close();
    }
}
