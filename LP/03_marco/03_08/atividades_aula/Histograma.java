import java.util.Scanner;

public class Histograma {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int vogaisCount[] = new int[5], i = 0, j = 0;
        char vogais[] = { 'a', 'e', 'i', 'o', 'u' };
        sc.close();
        for (i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'A':
                case 'a':
                    vogaisCount[0]++;
                    break;
                case 'E':
                case 'e':
                    vogaisCount[1]++;
                    break;
                case 'I':
                case 'i':
                    vogaisCount[2]++;
                    break;
                case 'O':
                case 'o':
                    vogaisCount[3]++;
                    break;
                case 'U':
                case 'u':
                    vogaisCount[4]++;
                    break;
            }
        }

        for (i = 0; i < vogais.length; i++) {
            System.out.print(vogais[i] + ": ");
            for (j = 0; j < vogaisCount[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" (" + vogaisCount[i] + ")\n");
        }

    }
}
