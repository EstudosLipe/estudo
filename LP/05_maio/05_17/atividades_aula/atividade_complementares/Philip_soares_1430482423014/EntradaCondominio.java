import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntradaCondominio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer morador[] = new StringBuffer[7];

        // Nome do morador
        System.out.print("Digite o nome do morador\n-> ");
        morador[0] = formNome(sc);

        // Email do morador
        System.out.print("Digite o email do morador\n-> ");
        morador[1] = formEmail(sc);

        // DN do morador
        System.out.print("Digite a data de nascimento do morador\n-> ");
        morador[2] = formDn(sc);

        // TEL do morador
        System.out.print("Digite o telefone para contato\n-> ");
        morador[3] = formTel(sc);

        // Cadastro de carro
        if (cadastrarCarro(sc, morador)) {
            System.out.println("Carro Cadastrado");
        } else {
            System.out.println("Placa invalida");
        }

        sc.close();
    }

    public static StringBuffer formNome(Scanner sc) {
        StringBuffer nome = new StringBuffer(sc.nextLine());

        // Verifica se o nome começa com caracteres especiais
        for (int i = 0; i < nome.length(); i++) {
            if (nome.codePointAt(i) != 32 && nome.codePointAt(i) < 65
                    || nome.codePointAt(i) > 90 && nome.codePointAt(i) < 97 || nome.codePointAt(i) > 122) {
                System.out.print("Nomes devem ter abreviações ou caracteres especiais\n-> ");
                return formNome(sc);
            }
        }

        // Verifica se foi imputado nome e sobrenome
        if (nome.length() < 5 || nome.indexOf(" ") == -1) {
            System.out.print("Digite Nome e sobrenome\n-> ");
            return formNome(sc);
        }

        return nome;
    }

    public static StringBuffer formDn(Scanner sc) {
        StringBuffer dn = new StringBuffer(sc.nextLine());

        // Verifica se tem 8 caracteres (ddmmYYYY).
        if (dn.length() != 8) {
            System.out.print("Digite Somente a data de nascimento! (Sem caracteres especiais)\n-> ");
            return formDn(sc);
        }

        // Verifica se a idade imputados é maior de 18 anos (regra de negócio todos que
        // Quem ainda fará 18 anos neste ano pode ser cadastrado
        try {
            if (Integer.parseInt(dn.substring(0, 2)) > 31 || Integer.parseInt(dn.substring(2, 4)) > 12) {
                System.out.print("data invalida. DIgite novamente!\n->");
                return formDn(sc);
            } else if (Integer.parseInt(dn.substring(4)) > 2007) {
                System.out.print("Você é menor de idade!");
                System.exit(0);
            }
            System.out.print(Integer.parseInt(dn.substring(0, 2)) + " " + Integer.parseInt(dn.substring(2, 4)) + " "
                    + Integer.parseInt(dn.substring(4)));
        } catch (java.lang.NumberFormatException e) {
            System.out.print("data invalida. DIgite novamente!\n->");
            return formDn(sc);
        }

        return dn;
    }

    public static StringBuffer formEmail(Scanner sc) {
        StringBuffer email = new StringBuffer(sc.nextLine());
        StringBuffer dominio = new StringBuffer();
        String dominios[] = { "@gmail.com", "@gmail.com.br", "@outlook.com", "@outlook.com.br", "@yahoo.com",
                "@yahoo.com.br", "@hotmail.com", "@hotmail.com.br" };

        try {
            dominio.append(email.substring(email.indexOf("@"), email.length()));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.print("Todo Email deve possuir um @. Digite Novamente!\n-> ");
            return formEmail(sc);
        }

        // Verifica se o email começa com caracteres especiais
        if (email.codePointAt(0) != 32 && email.codePointAt(0) < 65
                || email.codePointAt(0) > 90 && email.codePointAt(0) < 97 || email.codePointAt(0) > 122) {
            System.out.print(
                    "Emails não podem começar com números ou caracteres especiais!\nInsira seu email novamente\n-> ");
            return formEmail(sc);
        }

        // Verifica se o Domínio é valido e existe
        for (int i = 0; i < dominios.length; i++) {
            if (dominio.toString().compareTo(dominios[i]) == 0) {
                return email;
            }
        }

        System.out.print("Email invalido. DIgite novamente\n-> ");
        return formEmail(sc);
    }

    public static StringBuffer formTel(Scanner sc) {
        StringBuffer tel = new StringBuffer(sc.nextLine());

        int ddd[] = {
                11, 12, 13, 14, 15, 16, 17, 18, 19,
                21, 22, 24, 27, 28,
                31, 32, 33, 34, 35, 37, 38,
                41, 42, 43, 44, 45, 46, 47, 48, 49,
                51, 53, 54, 55,
                61, 62, 64, 63, 65, 66, 67, 68, 69,
                71, 73, 74, 75, 77, 79,
                81, 87, 82, 83, 84, 85, 88, 86, 89,
                91, 93, 94, 92, 97, 95, 96, 98, 99
        };

        // Verifica se tem 11 caracteres (ddd9xxxxxxxx).
        if (tel.length() != 11) {
            System.out.print("Digite o número de telefDone! (Sem caracteres especiais)\n-> ");
            return formTel(sc);
        }

        // Verifica se os valores imputados são numerais.
        for (int i = 0; i < tel.length(); i++) {
            if (tel.codePointAt(i) < 48 && tel.codePointAt(i) > 57) {
                System.out.print("Digite o número de telefone! (Sem caracteres especiais)\n-> ");
                return formTel(sc);
            }
        }

        // verifica se o DDD digitado é valido
        for (int i = 0; i < ddd.length; i++) {
            if (Integer.parseInt(tel.substring(0, 2)) == ddd[i]) {
                return tel;
            }
        }

        System.out.print("Numero de telefone inválidos\n-> ");
        return formTel(sc);
    }

    public static boolean cadastrarCarro(Scanner sc, StringBuffer morador[]) {
        StringBuffer placa = new StringBuffer();
        StringBuffer marca = new StringBuffer();
        StringBuffer modelo = new StringBuffer();

        System.out.print("Digite o modelo do carro\n-> ");
        morador[4] = (modelo.append(sc.nextLine()));

        System.out.print("Digite o marca do carro\n-> ");
        morador[5] = (marca.append(sc.nextLine()));

        System.out.print("Digite a placa do carro\n-> ");
        placa.append(sc.nextLine());

        String regex = "^([A-Z]{3}-?[0-9]{4}|[A-Z]{3}[0-9][A-Z][0-9]{2})$";

        // Compilar o padrão
        Pattern pattern = Pattern.compile(regex);

        // Criar o matcher com a string
        Matcher matcher = pattern.matcher(placa.toString().toUpperCase());

        // Verificar se combina
        if (matcher.matches()) {
            morador[6] = placa;
            return true;
        }
        return false;
    }
}