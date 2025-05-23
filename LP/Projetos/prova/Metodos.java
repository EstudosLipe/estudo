import java.util.Scanner;

public class Metodos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N<0 || N>4) {
            System.out.print("Valor Invalido, digite novamente:\n-> ");
            N = sc.nextInt();
        }
        if (N == 1) {
            System.out.print(metodo1(sc));
        }
        if (N == 2) {
            String nome = sc.next();
            metodo2(nome);
        }
        sc.close();
    }

    public static char metodo1(Scanner sc){
        int matriz[][] = new int[3][3], soma=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i>j) {
                    System.out.print(matriz[i][j]+" ");
                }
                if (i+j==matriz.length-1) {
                    soma+=matriz[i][j];
                }
            }
        }
        if (soma%2==0) {
            return 'v';
        }else{
            return 'f';
        }
    }

    public static void metodo2(String nome){
        int i=0,a=0;
        while (i< nome.length()) {
            if (nome.charAt(i)=='a') {
                a+=1;
            }
        }
        System.out.print("Esse nome tem um total de: "+a+" a");
    }

    public static
}