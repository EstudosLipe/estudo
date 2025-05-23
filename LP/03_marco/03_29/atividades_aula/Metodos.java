import java.util.Scanner;
public class Metodos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n=sc.nextInt();
        if(n<0 || n>3){
            while (n<0 || n>3){
                System.out.print("Valor Invalido. Digite novamente:\n->");
                n=sc.nextInt();
            };
        }
        if(n==1){
            System.out.print(metodo1(n, sc));
        }else if(n==2){
            metodo2(sc);
        }else if(n==3){
            System.out.print(metodo3(sc));
        }
        sc.close();
    }
    public static int metodo1(int n, Scanner sc){
        int vetA[] = new int[5], soma=0;
        for(int i=0; i<vetA.length; i++){
            vetA[i]=sc.nextInt();
            if (vetA[i]%2==0 && vetA[i]%3==0) {
                soma+=vetA[i];
            }
        }
        return soma;
    }
    public static void metodo2(Scanner sc){
        int A[] = new int[10], B[] = new int[10];
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 1; j <= A[i]; j++) {
                B[i]+=j;
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+" ");
        }
    }
    public static char metodo3(Scanner sc){
        int n=sc.nextInt(), vetA[][] = new int[n][n];
        char tipoMatriz = ' ';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vetA[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j<i) {
                    if (vetA[i][j]==0) {
                        tipoMatriz='V';
                    }else{
                        tipoMatriz='F';
                        return tipoMatriz;
                    }
                }
            }
        }
        return tipoMatriz;
    }
}