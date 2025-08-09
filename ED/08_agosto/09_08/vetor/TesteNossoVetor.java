import java.util.Scanner;

public class TesteNossoVetor {
    public static void main(String args[]) {
        // Deaclaração de obj
        Scanner sc = new Scanner(System.in);
        NossoVetor nossoVetor = new NossoVetor(sc.nextInt());

        try {
            nossoVetor.setValorVetor(1, 10);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Burro");
        }

        System.out.println("Nosso Vetor:\n" + nossoVetor);

        sc.close();
    }
}
