import java.util.Scanner;

public class Bee1007 {
	public static void main(String args[]) {
		int valores[]=new int[4];
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0; i<valores.length; i++) {
				valores[i] = sc.nextInt();
			}
			System.out.println("DIFERENCA = "+diferencaProdutos(valores));
			sc.close();
		} catch (java.util.InputMismatchException e) {
			System.out.print("Digite somente valores inteiros");
		}
	}

	public static int diferencaProdutos(int valores[]) {
		return (valores[0] * valores[1]) - (valores[2] * valores[3]);
	}
}