//importar a classe Scanner
import java.util.Scanner;

//classe vetor
public class Vetor{
	//classe principal
	public static void main(String args[]){
		
		//instaciando a classe Scanner
		Scanner sc = new Scanner(System.in);
		
		//declaração de variaveis
		int i=0, j=0, maior=0, soma=0, tamanho=sc.nextInt();
		//Instcaniar a classe do vetor (tipo double)
		double aux1=0, aux2=0, notas[] = new double[tamanho], notas3x[] = new double[tamanho], notasInverso[]=new double[tamanho];
		
		//Looping para armazenar tamanho valores
		for (i=0; i<tamanho; i++){
			System.out.print("Escreva um numero de 0-9: ");
			notas[i]=sc.nextDouble();
		}
		
		//EX.1: Looping para printar 10 valores
		for (i=0; i<tamanho; i++){
			System.out.print(notas[i]+"\n");
		}
		
		System.out.println();
		
		//EX.1.1: Ordem inversa
		for (i=tamanho-1; i>=0; i--){
			System.out.print(notas[i]+"\n");
		}
		
		System.out.println();
		
		//EX.2: Vetor com o multiplo de 3 de outro vetor
		for (i=0; i<tamanho; i++){
			notas3x[i]=notas[i]*3;
			System.out.print(notas3x[i]+"\n");
		}
		System.out.println();
		
		//EX.3: Encontrar o maior
		for (i=0; i<tamanho; i++){
			if(notas[i]>maior){
				maior = (int)notas[i];
			}
		}
		System.out.print("O maior numero é o: "+ maior+"\n");
		System.out.println();
		
		//EX.4: Calcular os valores de indices impar
		for(i=0; i<tamanho; i++){
			if(i%2==1){
				soma=soma+(int)notas[i];
				System.out.print("O valor do Indice "+ i+" é: "+notas[i]+"\n");
			}
		}
		System.out.print("A soma dos valores de indice impar são: "+ soma+"\n");
		System.out.println();
		
		//EX.5: Mostrar valores positivos
		for(i=0; i<tamanho; i++){
			if(notas[i]>0){
				System.out.print("O numero "+notas[i]+" é positivo\n");
			}
		}
		System.out.println();
		
		//EX.6: 
		for (i=0; i<tamanho; i++){
			System.out.print("Escreva um numero de 0-9: ");
			notasInverso[i]=sc.nextDouble();
		}
		
		for (i=tamanho-1,j=0; i>=0 && j<tamanho; i--, j++){
			aux1 = notasInverso[i];
			notasInverso[i]=notas[j];
			notas[i]=aux1;
		}
		for(i=0; i<tamanho; i++){
			System.out.print(notas[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(i=0; i<tamanho; i++){
			System.out.print(notasInverso[i]+" ");
		}
		
	}
}