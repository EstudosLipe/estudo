
public class Pessoas {
    public int ID;
    public String nome;
    public String endereco;

    public Pessoas(int id, String nome, String endereco){
        this.ID = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirPessoa(){
        System.out.println(ID);
        System.out.println(nome);
        System.out.println(endereco);
    }
}
