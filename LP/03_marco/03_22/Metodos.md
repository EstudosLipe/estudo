# METÓDOS (SUBPROGRAMA OU SUB-ROTINAS)
- nome de metódo por boas praticas é um verbo no infinitivo

Trecho independente do programa com atribuições bem definidas.

Serve para reaproveitamento de codigos, modularizando o programa

Em diferentes linguagens pode ser chamadas de FUnções

<!-- ```java
Scanner sc = new Scanner(Sytem.in);
int num;
num = sc.nextInt(param);
```
- sc == obj
- nextInt() == method -->

### Sintaxe
```java
[acesso] [static] [type] [nameMethod]([params]){
    int result = val1+val2;
    System.out.print(restul);
    return;
}

```
- acesso = forma para acessar este method:
    - public;
    - private;
    - proteged;
- static = não necessita de um objeto para funcionar.
- type = tipagem do retorno ao fim do method:
    - int;
    - float;
    - char;
    - bool;
    - void: tipagem de retorno vazio;
- name = nome do method
- params = parametros para o method funcionar

### ENTENDENDO O METHOD PRINCIPAL

### EXEMPLOS
1. 
```java
import java.util.Scanner;

public class ImparOuPar {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        verificarImparOuPar(numero);

        sc.close();
    }

    /**
     * Methodo que veririca se ele é par
     * @param {int} n1
     * @return {String} se o valor é par ou impar 
     */
    public static void verificarImparOuPar(int n1){
        if(n1%2==0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
    }
}
```
2. 
```java

```
3. 
```java
```
4. 
```java
```
5. 
```java

```