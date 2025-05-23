
import java.util.Scanner;

public class ContaMaiusculas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int i = 0, count = 0;
        sc.close();
        for (i = 0; i < frase.length(); i++) {
            if (frase.codePointAt(i) < 91) {
                count++;
            }
        }
        System.out.print(count);

    }
}
