import java.util.Scanner;

public class Npalavras {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i = 0, qtdWords = sc.nextInt();
        String ch = sc.next(), palavras[] = new String[qtdWords];
        sc.close();
        System.out.print("Digite um total de " + qtdWords + " palavras com a letra *" + ch + "*:\n");
        while (i < qtdWords) {
            System.out.print("-> ");
            palavras[i] = sc.next();
            if (palavras[i].charAt(0) == ch.charAt(0)) {
                i++;
            } else {
                System.out.print("Esta palavra não começa com: *" + ch + "* digite novamente\n");
            }
        }

        for (i = 0; i < palavras.length; i++) {
            System.out.print(palavras[i] + "\n");
        }

    }
}