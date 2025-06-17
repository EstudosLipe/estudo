public class Pessoa {
    private StringBuffer nome = new StringBuffer();
    private String profissao;
    private String DN;
    private int idade;

    public Pessoa() {
        setNome("Philip Viana");
        setProfissao("Analista de Dados");
        setDN("30012006");
        setIdade(this.DN);
    }

    public Pessoa(String fieldNome, String fieldProfissao, String fieldDN) {
        setNome(fieldNome);
        setProfissao(fieldProfissao);
        setDN(fieldDN);
        setIdade(this.DN);
    }

    public Pessoa(Pessoa objPessoa) {
        setNome(objPessoa.getNome().toString());
        setProfissao(objPessoa.getProfissao());
        setDN(objPessoa.getDN());
        setIdade(objPessoa.getDN());
    }

    public void setNome(String fieldNome) {
        nome.replace(0, nome.length(), fieldNome);
    }

    public StringBuffer getNome() {
        return this.nome;
    }

    public void setProfissao(String fieldProfissao) {
        profissao = fieldProfissao;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setDN(String fieldDN) {
        this.DN = fieldDN;
    }

    public String getDN() {
        return this.DN;
    }

    public void setIdade(String DN) {
        if (Integer.parseInt(DN.substring(4))%4==0 ||Integer.parseInt(DN.substring(4))%400==0) {
            this.idade = 2025 - Integer.parseInt(DN.substring(4));
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + getNome() + "\n" + "Profissao: " + getProfissao() + "\n" + "Data de Nascimento: "
                + getDN() + "\n" + "Idade: " + getIdade() + "\n");
    }

}
