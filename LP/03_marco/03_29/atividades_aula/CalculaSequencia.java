import java.util.Scanner;
public class CalculaSequencia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextInt(), n=sc.nextInt();
        System.out.print(calculaSequencia(a, n));
        sc.close();
    }
    public static double calculaSequencia(double a, double n){
        double calculo=0;

        for (int i = 1; i <= n; i++) {
            calculo += 1/(a*i);
            System.out.println(calculo);
        }

        return calculo;
    }
}