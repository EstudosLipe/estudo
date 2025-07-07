import java.util.Scanner;
public class Computador {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o sistema Operacional que deseja iniciar\n1 - Ubuntu\n2 - Mint\n3 - Fedora\n-> ");
        int option = sc.nextInt();

        Linux so = null;

        switch (option){
            case 1:
                so = new Ubuntu();
                so.gerenciadoTarefas();            
                break;
            case 2:
                so = new Mint();
                so.gerenciadoTarefas();
                break;
            case 3: 
                so = new Fedora();
                so.gerenciadoTarefas();
                break;
            default:
        }

        sc.close();
    }
}