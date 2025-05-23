
import java.util.Scanner;

public class Exer01 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nome1 = sc.next(), nome2 = sc.next();

        System.out.println("Seu nome: "+nome1+", e a primeira letra do seu nome é: "+nome1.charAt(0));
        System.out.println("Seu nome: "+nome2+", e a primeira letra do seu nome é: "+nome2.charAt(0));
        
        sc.close();
    }
}
