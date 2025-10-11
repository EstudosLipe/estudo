public class Produto {
    private int id;
    private String nome;
    private int qtd;

    public Produto(int id, String nome) {
        setId(id);
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd(int qtd) {
        return this.qtd;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", qtd=" + qtd;
    }

    public void atualizaEstoque(int valor) {
        if (this.qtd + valor < 0) {
            this.qtd = 0;
        } else {
            this.qtd = this.qtd + valor;
        }
    }

}