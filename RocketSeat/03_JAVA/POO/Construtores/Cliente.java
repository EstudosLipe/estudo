package POO.Construtores;

public class Cliente {
    StringBuffer nome;
    Double limiteCredito = 100.0;

    public void comprar(Double valor){
        limiteCredito -= valor;
    }
}
