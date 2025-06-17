import java.util.Scanner;
public class Computador {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o sistema Operacional que deseja iniciar\n1 - Ubuntu\n2 - Mint\n3 - Fedora\n-> ");
        int option = sc.nextInt();

        switch (option){
            case 1:
                Ubuntu ubuntu = new Ubuntu();
                ubuntu.gerenciadoTarefas();
                break;
            case 2:
                Mint mint = new Mint();
                mint.gerenciadoTarefas();
                break;
            case 3: 
                Fedora fedora = new Fedora();
                fedora.gerenciadoTarefas();
                break;
            default:
                System.err.print("SO não encontrado");
                System.exit(0);
        }

        sc.close();
    }
}