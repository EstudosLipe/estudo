import java.util.Scanner;

public class Almoxarifado {
    static void chegaProduto() {

    }

    public static void main(String[] args) {
        Produto[] prateleira = new Produto[100];
        Fila esteira = new Fila();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o código \n-> ");
            int codigo = sc.nextInt();

            System.out.println("Digite o nome \n-> ");
            sc.nextLine();
            String nome = sc.nextLine();

            Produto p = new Produto(codigo, nome);
            esteira.queue(p);
        }

        System.out.println("Esteira Montada: ");
        System.out.println(esteira);

        System.out.println("\nIndo para prateleira:");
        int i = 0;
        while (!esteira.isEmpty()) {
            Produto p = esteira.dequeue();
            System.out.println("Quanto chegou de: " + p.getNome());
            int qtd = sc.nextInt();
            p.atualizaEstoque(qtd);
            prateleira[i++] = p;
        }
        System.out.println("Prateleira arrumada: ");
        for (int j = 0; j < i; j++) {
            System.out.println("Posição " + j + ": " + prateleira[i]);
        }
    }
}
