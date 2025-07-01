public class Dados {
    private String nome;
    private String telefone;

    public Dados(Long tel, String nome){
        setNome(nome);
        setTelefone(tel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(Long telefone) {
        this.telefone = formarTelfeone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public String formarTelfeone(Long telefone){
        StringBuilder tel = new StringBuilder(telefone.toString());

        tel.insert(0, "(");tel.insert(3, ")");tel.insert(4, " ");

        return tel.toString();
    }

    public String salvarContato(Dados pessoa){

        StringBuilder linha = new StringBuilder();

        linha.append(pessoa.getNome()+pessoa.getTelefone());

    }
}
