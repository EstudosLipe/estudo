import java.util.Scanner;
public class Exer03Media{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float nota1=sc.nextFloat(), nota2=sc.nextFloat();
        
        String tipoMedia = sc.next();

        System.out.print(calcularMedia(nota1, nota2, tipoMedia));

        sc.close();
    }
    public static float calcularMedia(float nota1, float nota2, String tipoMedia){
        float valorMedia=0; 
        
        if(tipoMedia.charAt(0) == 'A' || tipoMedia.charAt(0) =='a'){
            valorMedia = (nota1+nota2)/2;
        }
        if(tipoMedia.charAt(0) == 'P' || tipoMedia.charAt(0)=='p'){
            valorMedia = ((nota1*7)+(nota2*3))/(7+3);
        }
        return valorMedia;
    }
}