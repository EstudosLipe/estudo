import java.util.Scanner;

public class SomaParVet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int vet[] = new int[10];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor "+i+"/10: \n->");
            vet[i] = sc.nextInt();
        }
        System.out.print(somaPar(vet));
        sc.close();
    }
    
    public static int somaPar(int[] vet){
        int soma=0,i=0;
        for(i=0; i<10; i++){
            if(vet[i]%2==0){
                soma = soma+vet[i];
            }
        }
        return soma;
    }
}