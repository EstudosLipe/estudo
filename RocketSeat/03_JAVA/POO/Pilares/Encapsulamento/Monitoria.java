import java.util.Scanner;
public class Monitoria {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Alerta alertasSistema = new Alerta();

        alertasSistema.emitirStatus();

        sc.close();
    }
}
