import java.util.Scanner;

public class FGTS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o seu nome:\n-> ");
        StringBuffer nome;
        nome = formNome(sc);

        System.out.print("Informe o seu salario:\n-> ");
        double salario = formSalario(sc); 

        calcularFGTS(nome, salario);
        sc.close();
    }

    public static StringBuffer formNome(Scanner sc) {
        StringBuffer nome = new StringBuffer(sc.nextLine());

        // Verifica se tem menos de 5 ou mais que 50 caracteres
        if (nome.length() < 5 || nome.length() > 50) {
            System.out.print("Erro: Número de caracteres inválido! Digite novamente!\n-> ");
            return formNome(sc);
        }
        // Verifica se tem numero no nome
        for (int i = 0; i < nome.length(); i++) {
            if (nome.codePointAt(i) > 47 && nome.codePointAt(i) < 58) {
                System.out.print("Erro: O nome não pode conter números!\n-> ");
                return formNome(sc);
            }
        }
        return nome;
    }

    public static double formSalario(Scanner sc) {
        double salario = 0;
        try{
            salario = sc.nextDouble();
            if(salario<1518.00){
                System.out.print("Erro: salario abaixo do salario mínimo (R$1518.00)\n-> ");
                formSalario(sc);
            }
        }catch(java.util.InputMismatchException e){
            System.out.print("Erro: Informe um salario válido!\n->");
            sc.nextLine();
            return formSalario(sc);
        }

        return salario;
    }
    public static void calcularFGTS(StringBuffer nome, double salario){
        double fgts = salario*0.08;
        System.out.print("Nome: "+nome+"\nSalario: "+salario+"\nFGTS: R$"+fgts);
    }
}