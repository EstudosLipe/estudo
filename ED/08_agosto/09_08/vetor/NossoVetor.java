// Classe modelo

import java.util.Random;

public class NossoVetor {
    private int vetor[];

    // Atributo ocupação para realizar controle do n° de valores validos
    private int ocupacao;

    // Blocos de construção de Objetos (inicialização de OBJs)
    // Construtor padrão
    public NossoVetor() {
        vetor = new int[10];
        ocupacao = 0;
    }

    // Construtor parametrizados
    public NossoVetor(int capacity) {
        vetor = new int[capacity];
        ocupacao = 0;
    }

    // Verifica se o array está cheio
    public boolean verifyFull() {
        return this.ocupacao == this.vetor.length;
    }

    // Verifica se o array está vazio
    public boolean verifyEmpty() {
        return ocupacao == 0;
    }

    private void redimensionar(int newLenght) {
        int vetorLocal[] = new int[newLenght];
        for (int i = 0; i < this.ocupacao; i++) {
            vetorLocal[i] = this.vetor[i];
        }
        this.vetor = vetorLocal;
    }

    // Getters e Setters
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

    // Inserir um elemento no vetor
    public void insertElement(int element) {
        if (this.verifyFull()) {
            this.redimensionar(this.vetor.length * 2);
        }
        this.vetor[this.ocupacao++] = element;
    }

    public int removeElement() {
        if (!this.verifyEmpty()) {
            this.ocupacao--;
            if (this.vetor.length > 4 && this.ocupacao <= vetor.length / 4) {
                redimensionar(this.vetor.length / 2);
            }
            return vetor[ocupacao];
        }
        return -1;
    }

    public boolean containsElement(int element) {
        for (int i = 0; i < vetor.length; i++) {
            if (this.vetor[i] == element) {
                return true;
            }
        }
        return false;
    }

    public NossoVetor cloneObject(NossoVetor vetor) {
        NossoVetor clone = new NossoVetor(vetor.getVetor().length);
        for (int i = 0; i < this.vetor.length; i++) {
            clone.insertElement(vetor.getVetor()[i]);
        }
        clone.ocupacao = this.ocupacao;
        return clone;
    }

    public int size() {
        return this.ocupacao;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < this.vetor.length; i++) {
            this.vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = this.vetor.length;
    }

    int partition(int p, int r) {
        int x = this.vetor[r]; // o pivo é o ultimo elemento
        int i = p - 1;
        int aux = 0;
        for (int j = p; j < r; j++) {
            if (this.vetor[j] <= x) {
                i++;
                aux = this.vetor[i];
                this.vetor[i] = this.vetor[j];
                this.vetor[j] = aux;
            }
        }
        i++;
        aux = this.vetor[r];
        this.vetor[r] = this.vetor[i];
        this.vetor[i] = aux;
        return i;
    }

    void quickSort(int p, int r) {
        if (p < r) {
            int q = partition(p, r);
            quickSort(p, q - 1);
            quickSort(q + 1, r);
        }
    }

    // Método ToString generaliza a devolução para ser impresso em qualquer
    // dispositivo
    @Override // Sobrescrita
    public String toString() {
        String s = "Tamanho = " + this.vetor.length + "\nOcupacao = " + this.ocupacao + "\n";
        for (int i = 0; i < this.vetor.length; i++) {
            s += vetor[i] + " ";
        }
        return s;
    }
}