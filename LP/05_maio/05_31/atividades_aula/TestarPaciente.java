import java.util.Scanner;
public class TestarPaciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine(), dn = sc.nextLine();
        double peso=sc.nextDouble(), altura = sc.nextDouble();

        Paciente teste = new Paciente();
        Paciente jose = new Paciente(nome, dn, peso, altura);
        Paciente joseCopia = new Paciente(jose);

        // Imprimir do objeto teste
        teste.imprimirPaciente();
        System.out.println(teste.verificarSituacao());

        // Imprimir do objeto jose
        jose.imprimirPaciente();
        System.out.println(jose.verificarSituacao());

        // Imprimir do objeto joseCopia
        joseCopia.imprimirPaciente();
        System.out.println(joseCopia.verificarSituacao());

        sc.close();
    }
}
