import java.util.Scanner;

public class Exer01ImparOuPar {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        verificarImparOuPar(numero);

        sc.close();
    }

    /**
     * Methodo que veririca se ele é par
     * @param {int} n1
     * @return {String} se o valor é par ou impar 
     */
    public static void verificarImparOuPar(int n1){
        if(n1%2==0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
    }
}
