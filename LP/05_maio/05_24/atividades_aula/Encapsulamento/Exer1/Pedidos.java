public class Pedidos {
    private int numeroPed;
    private String dataPed;
    private double valorPed;
    
    public Pedidos(int numeroPed, String dataPed, double valorPed){
        setDataPed(dataPed);
        setNumeroPed(numeroPed);
        setValorPed(valorPed);
    }

    public void setNumeroPed(int numeroPed) {
        this.numeroPed = numeroPed;
    }

    public int getNumeroPed() {
        return this.numeroPed;
    }

    public void setDataPed(String dataPed) {
        this.dataPed = dataPed;
    }

    public String getDataPed() {
        return this.dataPed;
    }

    public void setValorPed(double valorPed) {
        this.valorPed = valorPed;
    }

    public double getValorPed() {
        return this.valorPed;
    }
}
