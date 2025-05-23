import java.util.Scanner;

public class TrocaVet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vetor1[], vetor2[];
        vetor1 = preencheVetor(sc);
        vetor2 = preencheVetor(sc);

        System.out.println("Vetor 1 era:");
        mostraVetor(vetor1);

        System.out.println("Vetor 2 era:");
        mostraVetor(vetor2);

        vetor1 = trocaVetores(vetor1, vetor2);
        vetor2 = trocaVetores(vetor2, vetor1);

        System.out.println("Vetor 1 agora é:");
        mostraVetor(vetor1);

        System.out.println("Vetor 2 agora é:");
        mostraVetor(vetor2);

        sc.close();
    }
    public static int[] preencheVetor(Scanner sc){
        int vetor[]=new int[3], i=0;
        
        for(i=0; i<vetor.length; i++){
            vetor[i]=sc.nextInt();
        }
        
        return vetor;
    }
    public static int[] trocaVetores(int[] vet1, int[] vet2){
        int aux=0;
        for (int i = 0, j=vet1.length-1; i < vet1.length && j>=0; i++, j--) {
            aux = vet1[i]; 
            vet1[i]=vet2[j];
            vet2[j]=aux;
        }
        return vet1;
    }
    public static void mostraVetor(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+" ");
        }
        System.out.println();
    }
}