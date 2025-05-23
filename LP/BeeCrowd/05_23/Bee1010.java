import java.util.Scanner;

public class Bee1010 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int code1, code2, qtd1, qtd2;
        double val1, val2;

        code1 = sc.nextInt();
        qtd1 = sc.nextInt();
        val1 = sc.nextDouble();
        code2 = sc.nextInt();
        qtd2 = sc.nextInt();
        val2 = sc.nextDouble();

        System.out.println("PRODUTO " + code1 + " + O PRODUTO " + code2 + " VALOR A PAGAR: R$ " + String.format("%.2f", ((val1 * qtd1) + (val2 * qtd2))));
        
        sc.close();
    }
}
