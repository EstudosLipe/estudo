// Classe modelo
public class NossoVetor {
    private int vetor[];

    // Bloco de construção de Objetos (inicialização de OBJs)
    public NossoVetor(int capacity) {
        this.setVetor(capacity);
    }

    // Getters e Setters
    public void setVetor(int capacity) {
        this.vetor = new int[capacity];
    }

    public int[] getVetor() {
        return this.vetor;
    }

    // Getters e Setters Posição do vetor
    public void setValorVetor(int index, int val) {
        this.vetor[index] = val;
    }

    public int getValorVetor(int index) {
        return this.vetor[index];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.vetor.length; i++) {
            s += vetor[i] + "\n";
        }
        return s;
    }
}