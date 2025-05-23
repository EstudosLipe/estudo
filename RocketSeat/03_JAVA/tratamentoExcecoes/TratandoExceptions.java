/*
 * RuntimeException é uma exceção que ocorre durante a execução do programa.
 * Extended Exception são exceções que nos retorna um erro antes da execução do programa, e devem ser obrigatoriamente tratadas.
 * 
 * Podemos conferir 
 */

import java.util.Scanner;
public class TratandoExceptions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        

        sc.close();
    }
}