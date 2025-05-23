import java.util.Scanner;

public class tratarCPF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String regioes[][] = {
                { "DF", "1" }, { "GO", "1" }, { "MT", "1" }, { "MS", "1" }, { "TO", "1" },
                { "AC", "2" }, { "AP", "2" }, { "AM", "2" }, { "PA", "2" }, { "RO", "2" }, { "RR", "2" }, { "MA", "2" },
                { "CE", "3" }, { "PI", "3" }, { "RN", "3" }, { "PB", "3" }, { "PE", "3" }, { "AL", "3" }, { "SE", "3" },
                { "BA", "4" }, { "SE", "4" },
                { "MG", "6" },
                { "RJ", "7" }, { "ES", "7" },
                { "SP", "8" },
                { "PR", "9" }, { "SC", "9" },
                { "RS", "0" }
        };
        StringBuffer cpf = new StringBuffer(), estado = new StringBuffer();
        // try {
        System.out.print("Digite o CPF\n-> ");
        cpf.append(sc.nextLine());
        System.out.print("Digite o ESTADO\n-> ");
        estado.append(sc.nextLine());
        System.out.println(verificarCPF(cpf, estado, regioes) ? "CPF Válido" : "CPF Inválido");
        // } catch (Exception e) {
        // System.out.println("Erro: " + e.getMessage());
        // }
        sc.close();
    }

    public static boolean verificarCPF(StringBuffer cpf, StringBuffer estadoDigitado, String regioes[][]) {
        Integer indexCpf = 0;
        int codigoEstado = 0;

        for (int i = 0; i < regioes.length; i++) {
            if (regioes[i][0].compareTo(estadoDigitado.toString()) == 0) {
                codigoEstado = (int) regioes[i][1].charAt(0) - 48;
            }
        }

        for (int i = 0, aux = 10; i < 9 && aux > 1; i++, aux--) {
            if (cpf.codePointAt(i) > 47 || cpf.codePointAt(i) < 58) {
                indexCpf += ((int) cpf.charAt(i) - 48) * aux;
            } else {
                System.out.print("O CPF deve conter apenas números\n-> ");
                return false;
            }
        }
        
        // Zera o indexCpf
        indexCpf = 11 - (indexCpf % 11) == (int) cpf.charAt(9) - 48 ? 0 : null;
        for (int i = 0, aux = 11; i < 10 && aux > 1; i++, aux--) {
            indexCpf += ((int) cpf.charAt(i) - 48) * aux;
        }
        indexCpf = 11 - (indexCpf % 11) >= 10 ? 0 : 11 - (indexCpf % 11);
        if (indexCpf == (int) cpf.charAt(10) - 48 && codigoEstado == (int) cpf.charAt(8) - 48) {
            return true;
        }
        return false;
    }
}
/*
 * Questão B) Faça um programa em Java, usando tratamento de exceções, que
 * receba o CPF e o estado de uma pessoa e verifique se as informações estão de
 * acordo. Faça o tratamento caso as informações não sejam coerentes. Obs: Para
 * esse programa é necessário criar uma exceção própria.
 */