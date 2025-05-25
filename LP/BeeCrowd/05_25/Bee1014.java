import java.util.Scanner;

public class Bee1014{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double kmRodado = sc.nextDouble();
        double litrosFeitos = sc.nextDouble();

        System.out.println(String.format("%.3f", kmRodado/litrosFeitos)+" km/l");
        sc.close();
    }
}