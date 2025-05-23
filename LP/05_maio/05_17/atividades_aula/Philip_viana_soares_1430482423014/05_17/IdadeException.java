import java.util.Scanner;

public class IdadeException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja Entrar no sistema?p\n-> ");
        try {
            if (entrar(sc.next())) {
                System.out.print("Digite sua idade\n-> ");
                try {
                    int idade = sc.nextInt();
                    idade(idade);
                    System.out.println("Idade: " + idade);
                } catch (java.util.InputMismatchException e) {
                    e.getMessage();
                }
            }
            ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static boolean entrar(String request) throws Exception {
        if (request.charAt(0) != 's') {
            throw new Exception("Resposta inválida");
        }

        return request.charAt(0) == 's' ? true : request.charAt(0) == 'S' ? true : false;
    }

    public static void idade(int idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Idade menor que 18 anos");
        }
    }
}
