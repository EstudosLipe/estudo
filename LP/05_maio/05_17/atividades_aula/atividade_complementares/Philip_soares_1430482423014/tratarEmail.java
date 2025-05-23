import java.util.Scanner;

public class tratarEmail {
    public static void main(String args[]) {
        // Instanciando o Obj Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu email institucional (nome.sobrenome@fatec.sp.gov.br)\n-> ");
        StringBuffer email = formEmail(sc);
        System.out.println("Seja bem vindo a FATEC " + email);

        sc.close();
    }

    public static StringBuffer formEmail(Scanner sc) {
        StringBuffer email = new StringBuffer(sc.nextLine());
        StringBuffer dominio = new StringBuffer();

        try {
            dominio.append(email.substring(email.indexOf("@"), email.length()));

            // Verifica se o email começa com caracteres especiais
            if (email.codePointAt(0) != 32 && email.codePointAt(0) < 65
                    || email.codePointAt(0) > 90 && email.codePointAt(0) < 97 || email.codePointAt(0) > 122) {
                System.out.print(
                        "Emails não podem começar com números ou caracteres especiais.\nInsira um email institucional da FATEC\n-> ");
                return formEmail(sc);
            }
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.print(
                    "ERRO: Endereço de email invalido! Todo email deve possuir um @\nInsira um email institucional da FATEC\n-> ");
            return formEmail(sc);
        }

        // Verifica se o email está com nome sobrenome (aluno.sobrenome)
        if (email.substring(0, email.indexOf("@")).indexOf(".") == -1) {
            System.out.print(
                    "ERRO: Endereço de email invalido! Digite nome.sobrenome\nInsira um email institucional da FATEC\n-> ");
            return formEmail(sc);
        }

        // Verifica se o Domnio é correto
        StringBuffer dominioFatec = new StringBuffer("@fatec.sp.gov.br");
        if (dominio.compareTo(dominioFatec) != 0) {
            System.out.print(
                    "ERRO: Endereço de email invalido! Domínio Invalido.\nInsira um email institucional da FATEC\n-> ");
            return formEmail(sc);
        }

        // Passada todas as verificações retorna para o email
        return email;
    }
}