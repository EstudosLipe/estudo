import java.util.Scanner;
public class Exer06NumeroPerfeito{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(verificaNumeroPerfeito(num));
        sc.close();
    }
    
    public static StringBuffer verificaNumeroPerfeito(int numero){
        StringBuffer str=new StringBuffer("");
        int i=1, teste=0;

        for(i=1; i<numero; i++){
            if(numero%i==0){
                teste+=i;
                System.out.println(teste);
            }
        }
        if(numero==teste){
            str.append("é perfeito");
        }else{
            str.append("não é perfeito");
        }
        return str;
    }
}