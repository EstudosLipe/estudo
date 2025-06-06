import java.util.Scanner;

public class Cliente {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria philip = new ContaBancaria();
        ContaBancaria edu = new ContaBancaria(1, "Eduardo Ferreira", 2000);
        ContaBancaria philipCopia = new ContaBancaria(philip);
        
        System.out.print("1 - Ver dados dos clientes\n2 - Comprar\n3 - Ver carrinho\n\n0 - Sair\n-> ");
        int i = sc.nextInt();
        System.out.println();

        while (i != 0) {
            switch(i) {
                case 1:
                    philip.dadosCliente();
                    edu.dadosCliente();
                    philipCopia.dadosCliente();
                    break;
                case 2:
                    philip.comprar(200);
                    edu.comprar(800);
                    philipCopia.comprar(540);
                    break;
                case 3:
                    System.out.println(philip.getCarrinho());
                    System.out.println(edu.getCarrinho());
                    System.out.println(philipCopia.getCarrinho()+"\n");
                    break;
                default:
                    System.exit(i);
            }
            System.out.print("1 - Ver dados dos clientes\n2 - Comprar\n3 - Ver carrinho\n\n0 - Sair\n-> ");
            i = sc.nextInt();
            System.out.println();
        }

        sc.close();
    }
}
