// Ideia: Formulário de Login
// Objetivo: evitar que o usuário digita coisas erradas nos campos do formulário
// Resolução

import java.util.Scanner;

public class FormularioLogin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Nome (Campo livre de texto | Nome e sobrenome | Proibido números)
        System.out.print("Digite o seu nome e sobrenome!\n-> ");
        StringBuffer nome = formNome(sc);

        // Email (Campo livre de texto | Deve ter @dominio)
        System.out.print("Digite o seu email!\n-> ");
        StringBuffer email = formEmail(sc);

        // Senha (Campo Livre de texto | 8 caracteres)
        System.out.print("Digite a sua senha!\n-> ");
        StringBuffer senha = formSenha(sc);

        System.out.println("SEJA BEM VINDO AO FIM DO CADASTRO S2!\nNOME: " + nome + "\nEMAIL: " + email + "\nSENHA: " + senha);
        sc.close();
    }

    /**
     * Realiza a leitura do nome e sobrenome, verificando se estão preenchidos e se o mesmo não contém números
     * @param sc Scanner para leitura do nome
     * @return {StringBuffer} com o nome e sobrenome
     * @throws java.lang.StringIndexOutOfBoundsException caso o nome não contenha espaço
     */
    public static StringBuffer formNome(Scanner sc) {
        StringBuffer nome = new StringBuffer(sc.nextLine());
        try {

            for (int i = 0; i < nome.length(); i++) {
                if (nome.codePointAt(i) > 47 && nome.codePointAt(i) < 58) {
                    System.out.print("Erro: O seu nome e sobrenome não pode conter números!\n-> ");
                    return formNome(sc);
                }
            }
            for (int i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == ' ' && nome.charAt(i + 1) != ' ') {
                    return nome;
                }
            }
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.print("Deve Conter nome e Sobrenome!\n-> ");
            return formNome(sc);
        }
        System.out.print("Deve Conter nome e Sobrenome!\n-> ");
        return formNome(sc);
    };

    /**
     * Realiza a leitura do email, verificando se o mesmo contém @ e domínio
     * @param sc Scanner para leitura do email
     * @return {StringBuffer} com o email
     * @throws java.lang.StringIndexOutOfBoundsException caso o email não contenha o domínio
     */
    public static StringBuffer formEmail(Scanner sc) {
        StringBuffer email = new StringBuffer(sc.nextLine());
        try {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@' && email.charAt(i + 1) != ' ') {
                    return email;
                }
            }
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.print("Informe o domínio do seu email (@google | @outlook | @dominioCorp)\n-> ");
            return formEmail(sc);
        }

        System.out.print("Todo email deve constar @, digite novamente!\n-> ");
        return formEmail(sc);
    };

    /**
     * Realiza a leitura da senha, verificando se a mesma contém 8 caracteres
     * @param sc Scanner para leitura da senha
     * @return {StringBuffer} com a senha
     */
    public static StringBuffer formSenha(Scanner sc) {
        StringBuffer senha = new StringBuffer(sc.nextLine());

        if (senha.length() < 8) {
            System.out.print("A senha deve conter 8 caracteres!\n-> ");
            return formSenha(sc);
        }

        return senha;
    };



}