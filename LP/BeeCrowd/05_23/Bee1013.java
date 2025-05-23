import java.util.Scanner;
public class Bee1013 {
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), maiorAB = (a+b+Math.abs(a-b))/2;
        maiorAB = (maiorAB+c+Math.abs(maiorAB-c))/2;
        System.out.println(maiorAB+" eh o maior");
        sc.close();
    }
}
