import java.util.Scanner;

public class Criptografia {
    public static void main(String args[]){
        int aux=0;
        Scanner sc=  new Scanner(System.in);

        // Philip
        StringBuffer text[]=new StringBuffer[5];

        text[0].append(sc.nextLine());

        // int i=0;
        // for(i=0; i<text.length(); i++){
        //     if(text.codePointAt(i)>=41 &&text.codePointAt(i)<=122){
        //         aux = text.codePointAt(i)+3;
        //         System.out.println("");
        //         text=text.replace(text.charAt(i), (char)aux);
        //     }
        // }
        // for(i=text.length()-1; i>-1; i--){
        //     text2 += text.charAt(i);
        // }
        System.out.print(text[0]+"\n");
        sc.close();
    }
}
