public class Clientes {
    private int codCli;
    private StringBuffer nomeCli = new StringBuffer();
    private StringBuffer endCli = new StringBuffer();
    private StringBuffer telCli = new StringBuffer();

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public int getCodCli() {
        return this.codCli;
    }

    public void setNomeCli(StringBuffer codCli) {
        this.nomeCli = codCli;
    }

    public StringBuffer getNomeCli() {
        return this.nomeCli;
    }

    public void setEndCli(StringBuffer endCli) {
        this.endCli = endCli;
    }

    public StringBuffer getEndCli() {
        return this.endCli;
    }

    public void setTelCli(StringBuffer telCli) {
        this.telCli = telCli;
    }

    public StringBuffer getTelCli() {
        return this.telCli;
    }

}
