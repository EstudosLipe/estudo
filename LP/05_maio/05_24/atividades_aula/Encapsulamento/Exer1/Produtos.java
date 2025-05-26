public class Produtos {
    private int codProd;
    private StringBuffer descricaoProd = new StringBuffer();
    private double precoProd;

    public Produtos(int codProd, String descricaoProd, double precoProd){
        setCodProd(codProd);
        setDescProd(descricaoProd);
        setPrecoProd(precoProd);
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getCodProd() {
        return this.codProd;
    }

    public void setDescProd(String descricaoProd) {
        this.descricaoProd.append(descricaoProd);
    }

    public StringBuffer getDescProd() {
        return this.descricaoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public double getPrecoProd() {
        return this.precoProd;
    }

    
}
