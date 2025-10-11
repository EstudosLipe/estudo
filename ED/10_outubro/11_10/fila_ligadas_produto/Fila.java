public class Fila {
    private No primeiro;
    private No ultimo;

    // Constructor padrão
    public boolean isEmpty() {
        return primeiro == null;
    }

    // Inserção de fim
    public void queue(Produto produto) {
        No novo = new No(produto);
        if (isEmpty()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public Produto dequeue() {
        if (isEmpty())
            return null;
        Produto temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) {
            ultimo = null;
        }
        return temp;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Não chegou o Carregamento";
        }
        String s = "";
        No atual = primeiro;
        while (atual != null) {
            s += atual.getInfo() + " -> ";
            atual = atual.getProximo();
        }
        return s + "\\\\";
    }
}
