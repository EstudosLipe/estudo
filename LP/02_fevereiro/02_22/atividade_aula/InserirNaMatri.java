import java.util.Scanner;

public class InserirNaMatri{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Inserir valores em uma Matriz[4][4];

        int arr[][] = new int[4][4], i=0, j=0;

        for(i=0;i<arr.length; i++){
            for(j=0;j<arr.length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<arr.length; i++){
            for(j=0;j<arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}