import java.util.Scanner;

public class Exer05retornaConceitoPorMedia {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float media = sc.nextInt();
        System.out.print(retornarConceito(media));
        sc.close();
    }
    public static char retornarConceito(float media){
        char conceito=' ';

        if(media <= 10){
            conceito = 'A';
        }
        if(media < 9){
            conceito = 'B';
        }
        if(media < 7){
            conceito = 'C'  ;
        }
        if(media < 5){
            conceito = 'D';
        }
        return conceito; 
    }
}
