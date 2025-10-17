public class TesteOrder {
    public static void main(String args[]) {
        // Vetor 2000 val
        NossoVetor v2000 = new NossoVetor(2000);
        v2000.preencheVetor();

        // Bubble sort v2000 valores
        for (int i = 1; i < 16; i++) {
            NossoVetor v2000Copia = v2000.cloneObject(v2000);

            long ini = System.nanoTime();
            v2000.bubbleSort();
            long fim = System.nanoTime();

            if (i > 5) {
                // System.out.println("\nQuick demorou " + (fim - ini) + " milissegundos para "+
                // v2000Copia.size() + " itens");
                System.out.println(v2000Copia + "\n" + (fim - ini));
            }
        }
    }
}
