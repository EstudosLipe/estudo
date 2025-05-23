import java.util.Scanner;

// Classe
class CPFCaracteresExcedentes extends Exception {
    private StringBuffer detalhe;

    CPFCaracteresExcedentes(StringBuffer CPF) {
        detalhe.append("Os valores Digitados pelo CPF não são Valido");
    }

    public StringBuffer toStringBuffer() {
        return detalhe;
    }
}

public class tratarCPF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String regioes[][] = {
                { "DF", "1" }, { "GO", "1" }, { "MT", "1" }, { "MS", "1" }, { "TO", "1" },
                { "AC", "2" }, { "AP", "2" }, { "AM", "2" }, { "PA", "2" }, { "RO", "2" }, { "RR", "2" },
                { "CE", "3" }, { "MA", "3" }, { "PI", "3" },
                { "AL", "4" }, { "PB", "4" }, { "PE", "4" }, { "RN", "4" },
                { "BA", "5" }, { "SE", "5" },
                { "MG", "6" },
                { "ES", "7" }, { "RJ", "7" },
                { "SP", "8" },
                { "PR", "9" }, { "SC", "9" },
                { "RS", "0" }
        };
        StringBuffer cpf = new StringBuffer(), estado = new StringBuffer();

        System.out.println("Digite seu CPF (somente os valores numéricos!)\n-> ");
        cpf.append(sc.nextLine());
        System.out.println("Digite o emissor de seu CPF\n-> ");
        estado.append(sc.nextLine());

        try {
            if (verificarCPF(cpf, estado, regioes)) {
                System.out.println("CPF VALIDO!");
            }else{
                System.out.println("CPF INVALIDO!");
            }
        } catch (CPFCaracteresExcedentes e) {
            System.out.println("CPF INVALIDO!");
        }

        sc.close();
    }

    public static boolean verificarCPF(StringBuffer cpf, StringBuffer estado, String regioes[][])
            throws CPFCaracteresExcedentes {
        if (cpf.length() != 11) {
            throw new CPFCaracteresExcedentes(cpf);
        }

        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.codePointAt(i) < 48 || cpf.codePointAt(i) > 57) {
                throw new CPFCaracteresExcedentes(cpf);
            }
        }

        int indexCPF = 0;

        if ((int) cpf.charAt(8) - 48 == verificarEstados(regioes, estado)) {
            for (int i = 0, aux = 10; i < 9 && aux > 1; i++, aux--) {
                indexCPF += ((int) cpf.charAt(i) - 48) * aux;
            }
            indexCPF = indexCPF % 11 >= 10 ? 0 : 11 - (indexCPF % 11);
        }

        if (indexCPF == (int) cpf.charAt(9) - 48) {
            indexCPF = 0;
            for (int i = 0, aux = 11; i < 10 && aux > 1; i++, aux--) {
                indexCPF += ((int) cpf.charAt(i) - 48) * aux;
            }
            indexCPF = 11 - (indexCPF % 11) >= 10 ? 0 : 11 - (indexCPF % 11);
            return indexCPF != (int) cpf.charAt(9) - 48 ? true : false;
        }
        return false;
    }


    public static int verificarEstados(String regioes[][], StringBuffer estado) {
        int codigoEstado = -1;
        if (estado.length() > 2) {
            System.out.println("Digite somente a sigla do estado!");
        }
        for (int i = 0; i < regioes.length; i++) {
            if (estado.toString().toUpperCase().compareTo(regioes[i][0]) == 0) {
                codigoEstado = (int) (regioes[i][1].charAt(0)) - 48;
            }
        }
        return codigoEstado;
    }
}
/*
 * Questão B) Faça um programa em Java, usando tratamento de exceções, que
 * receba o CPF e
 * o estado de uma pessoa e verifique se as informações estão de acordo. Faça o
 * tratamento
 * caso as informações não sejam coerentes. Obs: Para esse programa é necessário
 * criar uma
 * exceção própria.
 */