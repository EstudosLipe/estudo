public class Lista {
    private No primeiro; // Controle da lista

    // construtor padrão
    // Não teremos gets/sets devido o atributo ser somente para controle da lista,
    // não tem interesse externo

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void insIncio(int info) {
        No novoNo = new No(info);

        if (!estaVazia()) {
            novoNo.setProximo(this.primeiro);
        }

        this.primeiro = novoNo;
    }

    public void insFim(int info) {
        No novoNo = new No(info);

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

    public int remInicio() {
        if (!estaVazia()) {
            int temp = this.primeiro.getInfo();
            this.primeiro = primeiro.getProximo();
            return temp;
        }
        return -1;
    }

    public int remFim(){
        if (estaVazia()) {
            return -1;
        }else if(primeiro.getProximo() == null){
            int temp = this.primeiro.getInfo();
            this.primeiro = null;
            return temp;
        }else{
            No atual = primeiro;
            while (atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
            int temp = atual.getProximo().getInfo();
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
