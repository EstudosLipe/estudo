import java.util.Scanner;
public class Exer08Tabuada {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        float numero = sc.nextFloat();

        System.out.println("Tabuada do "+(int)numero);

        for(i=0; i<=10; i++){
            System.out.print(numero+"*"+i+" = "+(int)multiplo(numero, i)+"\n");
        }

        sc.close();
    }
    public static float multiplo(float numero, int i){
        float result = numero*i;
        return result;
    }
}
