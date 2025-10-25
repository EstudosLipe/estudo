
public class Tree {

    private No root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insert(int i) {
        // No newNo = new No(i);

        if (isEmpty()) {
            this.root = new No(i);
        } else {
            insertRec(this.root, i);
        }
    }

    private void insertRec(No atual, int i) {

        if (i > atual.getInfo()) { //Vou pra direita
            if (atual.getDireita() == null) {
                atual.setDireita(new No(i));
            } else {
                insertRec(atual.getDireita(), i);
            }
        } else { //Vou pra esquerda
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(new No(i));
            } else {
                insertRec(atual.getEsquerda(), i);
            }
        }
    }

    public boolean verify(int i) {
        if (isEmpty()) {
            return false;
        } else {
            return verifyRec(root, i);
        }
    }

    private boolean verifyRec(No atual, int i) {
        if (i == atual.getInfo()) {
            return true;
        } else if (i > atual.getInfo()) {

            // Verificação da existencia do ramo da direita
            if (atual.getDireita() == null) {
                return false;
            }
            return verifyRec(atual.getDireita(), i);
        } else {
            
            if (atual.getDireita() == null) {
                return false;
            }
            return verifyRec(atual.getEsquerda(), i);
        }
    }

    public String inOrder() {
        if (isEmpty()) {
            return "Arvore vazia";
        } else {
            return inOrderRec(this.root);
        }
    }

    private String inOrderRec(No atual) {
        if (atual != null) {
            return inOrderRec(atual.getEsquerda()) + atual + inOrderRec(atual.getDireita());
        } else {
            return " ";
        }
    }
}

class No {

    private int info;
    private No esquerda;
    private No direita;

    public No(int info) {
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
