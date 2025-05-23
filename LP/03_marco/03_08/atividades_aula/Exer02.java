import java.util.Scanner;

public class Exer02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        int vogais[] = new int[5], i = 0;
        char vogaisChar[] = { 'a', 'e', 'i', 'o', 'u' };
        sc.close();
        for (i = 0; i < vogais.length; i++) {
            switch (nome.charAt(i)) {
                case 'A':
                case 'a':
                    vogais[0]++;
                    break;
                case 'E':
                case 'e':
                    vogais[1]++;
                    break;
                case 'I':
                case 'i':
                    vogais[2]++;
                    break;
                case 'O':
                case 'o':
                    vogais[3]++;
                    break;
                case 'U':
                case 'u':
                    vogais[4]++;
                    break;
            }
        }

        for (i = 0; i < vogais.length; i++) {
            System.out.println(vogaisChar[i] + "=" + vogais[i]);
        }
    }
}
