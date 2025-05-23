import java.util.Scanner;

public class Encaixa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;
        do {
            a = sc.nextInt();
        } while (a<0 || a+9000<10000);
        do {
            b = sc.nextInt();
        } while (a<0 || a+90<100);
        encaixarValores(a, b);
        sc.close();
    }
    public static void encaixarValores(int a, int b){
        String encaixa;
        if (a-1000==b) {
            encaixa = "Encaixa";
        }else{
            encaixa = "Não Encaixa";
        }
        System.out.print(encaixa);
    }

}