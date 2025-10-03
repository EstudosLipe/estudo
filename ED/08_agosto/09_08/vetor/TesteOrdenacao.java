import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;

        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        t = sc.nextInt();
        testaOrdenacao(t);

        sc.close();
    }

    public static void testaOrdenacao(int qtd) {
        Scanner sc = new Scanner(System.in);
        if (qtd != 0) {
            long ini;
            long fim;
            NossoVetor vetor = new NossoVetor(qtd);
            vetor.preencheVetor();
            // Bubble
            ini = new Date().getTime();
            vetor.bubbleSort();
            fim = new Date().getTime();
            System.out.println("\nBubble demorou " + (fim - ini) + " milissegundos para " + qtd + " itens");

            // ini = new Date().getTime();
            // vetor.insertSort();
            // fim = new Date().getTime();
            // System.out.println("\nInsert demorou " + (fim - ini) + " milissegundos para "
            // + qtd + " itens");

            // ini = new Date().getTime();
            // vetor.selectionSort();
            // fim = new Date().getTime();
            // System.out.println("\nSelection demorou " + (fim - ini) + " milissegundos
            // para " + qtd + " itens");

            // ini = new Date().getTime();
            // vetor.quickSort(0, vetor.size() - 1);
            // fim = new Date().getTime();
            // System.out.println("\nQuick demorou " + (fim - ini) + " milissegundos para "
            // + qtd + " itens");

            System.out.println(vetor);
            
            System.out.println("escolha o tamanho do vetor, 0 encerra: ");
            int t = sc.nextInt();
            testaOrdenacao(t);
        }
        sc.close();
    }
}