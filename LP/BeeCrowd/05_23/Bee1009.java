import java.util.Scanner;

public class Bee1009{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        StringBuffer nome = new StringBuffer();
        double salario, totalVendas;
        nome.append(sc.nextLine());
        salario = sc.nextDouble();
        totalVendas = sc.nextDouble();

        System.out.println("TOTAL = R$ "+String.format("%.2f", (salario+totalVendas*0.15)));

        sc.close();
    }
}