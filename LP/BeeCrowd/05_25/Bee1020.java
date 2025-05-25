import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt(), meses=0, anos=0;
        while (idade>=365) {
            idade = idade%365;
            anos++;
        }
        while (idade>=30) {
            idade = idade%30;
            meses++;
        }
        System.out.println(anos+" ano(s)\n"+meses+" mes(es)\n"+idade+" dia(s)");
        sc.close();
    }
}
