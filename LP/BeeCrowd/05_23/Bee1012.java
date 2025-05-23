import java.util.Scanner;

public class Bee1012 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();

        // Trinagulo retangulo
        System.out.println("TRIANGULO: "+String.format("%.3f",(a*c/2)));

        // Circulo
        System.out.println("CIRCULO: "+String.format("%.3f",(c*c*3.14159)));

        // Trapezio
        System.out.println("TRAPEZIO: "+String.format("%.3f",(a+b)*c/2));

        // Quadrado
        System.out.println("QUADRADO: "+String.format("%.3f",(b*b)));

        // Retangulo
        System.out.println("RETANGULO: "+String.format("%.3f",(a*b)));

        sc.close();
    }
}
