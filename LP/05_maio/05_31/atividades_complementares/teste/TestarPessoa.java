import java.util.Scanner;
public class TestarPessoa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(sc.nextLine(), sc.nextLine(), sc.nextLine());
        Pessoa p3 = new Pessoa(p2);

        p1.imprimirPessoa();
        p2.imprimirPessoa();
        p3.imprimirPessoa();

        sc.close();
    }
}
