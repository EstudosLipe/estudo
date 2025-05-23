import java.util.Scanner;

public class tratarEmail {
    public static void main(String args[]) {
        // Instanciando o Obj Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu email institucional\n-> ");
        try{
            StringBuffer email = formEmail(sc);
            System.out.println("Seja bem vindo a FATEC "+email);
        }catch(Exception e){
            e.getStackTrace();
        }

        sc.close();
    }
    public static StringBuffer formEmail(Scanner sc){
        StringBuffer email = new StringBuffer(sc.nextLine());
        StringBuffer dominio = new StringBuffer(email.substring(email.indexOf("@"), email.length()));
    
        // Verifica se o email começa com números
        if(email.codePointAt(0) > 47 && email.codePointAt(0) < 58){
            System.out.print("Emails não podem começar com números\n-> ");
            return formEmail(sc);
        }

        // Verifica se o email está com nome sobrenome (aluno.sobrenome)
        if(email.substring(0, email.indexOf("@")).indexOf(".")==-1){
            System.out.print("Insira um email institucional da FATEC\n-> ");
            return formEmail(sc);
        };

        // Verifica se o Domnio é correto
        StringBuffer dominioFatec = new StringBuffer("@fatec.sp.gov.br");
        if(dominio.compareTo(dominioFatec) != 0){
            System.out.print("Insira um email institucional da FATEC\n-> ");
            return formEmail(sc);
        };

        // Passada todas as verificações retorna para o email 
        return email;
    }
}
/*
 * Questão A) Elabore um programa em Java, usando tratamento de exceções, em que
 * o usuário deve inserir o seu email institucional, fazendo o tratamento para caso o
 * email digitado não seja o da instituição (@fatec.sp.gov.br)
 */