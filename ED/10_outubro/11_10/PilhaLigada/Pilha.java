public class Pilha {
    private No primeiro; // Controle da lista

    // construtor padrão
    // Não teremos gets/sets devido o atributo ser somente para controle da lista,
    // não tem interesse externo

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void push(int info) {
        No novoNo = new No(info);

        if (!estaVazia()) {
            novoNo.setProximo(this.primeiro);
        }

        this.primeiro = novoNo;
    }

    public void pop() {
        No novoNo = new No();

        if (estaVazia()) {
            primeiro = novoNo;
        } else {
            No atual = this.primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    @Override
    public String toString() {
        String s = "";
        if (!estaVazia()) {
            No atual = this.primeiro;
            while (atual != null) {
                s = s + atual + " -> ";
                atual = atual.getProximo();
            }
            s += "null";
            return s + "\n";
        }
        return "Lista Vazia";
    }

}
