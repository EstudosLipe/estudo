public class Recursao {

    public static void main(String[] args) {
        // for(int i=0;i<=20;i++){
        // System.out.printf("fatorial de %d = %.0f\n",i,fatorial(i));
        // }
        // System.out.println(fibonacci(500));

        System.out.println(multiply(4, 3));
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void showOneForNV1(int i, int n) {
        System.out.println(i);
        if (i < n) {
            showOneForNV1(i + 1, n);
        }
    }

    static void showOneForNV2(int n) {
        if (n > 1) {
            showOneForNV2(n - 1);
        }
        System.out.println(n);
    }

    static int sumOneForN(int n) {
        if (n > 1) {
            n += sumOneForN(n - 1);
        }
        return n;
    }

    static int sumOneForN(int i, int n) {
        if (i < n) {
            i += sumOneForN(i + 1, n);
        }
        return i;
    }

    static int exponential(int base, int poten) {
        if (poten == 0) {
            return 1;
        }
        return base = base * exponential(base, poten - 1);
    }

    static int multiply(int a, int b) {
        if (b == 0||b == 0) {
            return 0;
        }
        return a += multiply(a, b - 1);
    }

    //////////////////////////////////////////
    // *Fazer o do vetor de forma diferente*

    /////////////////////////////////////////

    static double fatorial(int n) {
        if (n <= 1)
            return 1;
        return n * fatorial(n - 1);
    }

}
