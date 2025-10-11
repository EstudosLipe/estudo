public class Lista {
    private No primeiro; // Controle da lista
    private No ultimo;

    // construtor padrão
    // Não teremos gets/sets devido os atributos ser somente para controle da lista,
    // não tem interesse externo

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void insIncio(int info) {
        No novoNo = new No(info);

        if (!estaVazia()) {
            novoNo.setProximo(this.primeiro);
        } else {
            this.ultimo = novoNo;
        }

        this.primeiro = novoNo;
    }

    public void insFim(int info) {
        No novoNo = new No(info);

        if (estaVazia()) {
            this.primeiro = novoNo;
        }

        this.ultimo = novoNo;
    }

    public int remInicio() {
        if (!estaVazia()) {
            int temp = this.primeiro.getInfo();
            this.primeiro = primeiro.getProximo();
            if (this.primeiro == null) {
                this.ultimo = null;
            }
            return temp;
        }
        return -1;
    }

    public int remFim() {
        if (estaVazia()) {
            return -1;
        }
        if (this.primeiro==this.ultimo) {
            int temp = this.primeiro.getInfo();
            this.primeiro = null;
            this.ultimo = null;
            return temp;
        } else {
            No atual = primeiro;
            while (atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
            int temp = this.ultimo.getInfo();
            this.ultimo = atual;
            atual.setProximo(null);
            return temp;
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
