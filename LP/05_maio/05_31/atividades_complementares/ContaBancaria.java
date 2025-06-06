public class ContaBancaria {
    private int numeroConta;
    private StringBuffer nomeTitular = new StringBuffer();
    private double saldoConta;
    private double carrinho;

    // Construtores
    public ContaBancaria() {
        setNomeTitular("Philip Viana");
        setNumeroConta(0);
        setSaldoConta(1200.0);
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoConta) {
        setNumeroConta(numeroConta);
        setNomeTitular(nomeTitular);
        setSaldoConta(saldoConta);
    }

    public ContaBancaria(ContaBancaria cliente) {
        setNumeroConta(cliente.numeroConta);
        setNomeTitular(cliente.nomeTitular.toString());
        setSaldoConta(cliente.saldoConta);
    }

    // Getters e Setters
    public void setNumeroConta(int id) {
        this.numeroConta = id;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setSaldoConta(double saldo) {
        this.saldoConta = saldo;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public void setNomeTitular(String nome) {
        this.nomeTitular.replace(0, this.nomeTitular.length(), nome);
    }

    public StringBuffer getNomeTitular() {
        return this.nomeTitular;
    }

    public void setCarrinho(double valor) {
        this.carrinho+=valor;
    }

    public double getCarrinho() {
        return this.carrinho;
    }

    public void dadosCliente() {
        System.out.println("Numero da conta: " + this.numeroConta + "\nTitular: " + this.nomeTitular + "\nSaldo: "
                + this.saldoConta + "\n");
    }

    public void comprar(double saldo) {
        setSaldoConta(this.saldoConta - saldo);
        setCarrinho(saldo);
    }
}