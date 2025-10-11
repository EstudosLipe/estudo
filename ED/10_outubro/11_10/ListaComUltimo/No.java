
public class No {
    private int info;
    private No proximo; // Elemento de mesma clase, recursão. Uma variavel de referencia aponta para ela

    // A construção do nó só e feita para armazenar uma informação
    public No(int info) {
        this.info = info;
        this.proximo = null; // Por clareza, porém, naturalmente ele assume esse valor
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    

    @Override
    public String toString() {
        return "[" + info + "]";
    }

}
