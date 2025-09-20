import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        int t;
        long ini;
        long fim;
        System.out.print ("escolha o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            
            v.preencheVetor();
            ini = new Date().getTime();
            v.quickSort(0, v.size()-1);
            fim = new Date().getTime();
            // System.out.print(v);
            System.out.println("\nquick demorou " + (fim - ini) + " milissegundos");

            // Estouro de pilha, ou seja, caiu no pior caso (a pilha já está ordenada)
            ini = new Date().getTime();
            v.quickSort(0, v.size()-1);
            fim = new Date().getTime();
            // System.out.print(v);
            System.out.println("\nquick2 demorou " + (fim - ini) + " milissegundos");
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}