
import java.util.Scanner;

public class Exer03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        nome = nome.replace('a', '*');
        System.out.println(nome);
        sc.close();
    }
}
