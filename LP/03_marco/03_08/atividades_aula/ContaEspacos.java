import java.util.Scanner;

public class ContaEspacos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int i = 0, space = 0;
        sc.close();
        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                space++;
            }
        }
        System.out.print("A quantidade de espaços presentes na frase é igual: " + space);

    }
}
