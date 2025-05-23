import java.util.Scanner;

public class Exer02Soma{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float val1, val2;
        val1 = sc.nextInt();
        val2 = sc.nextInt();
        calcularSoma(val1, val2);
        sc.close();
    }
    public static void calcularSoma(float val1, float val2){
        System.out.print(val1+val2);
    }
}