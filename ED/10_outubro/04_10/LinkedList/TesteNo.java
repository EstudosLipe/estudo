public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);

        no1.setProximo(no2);
        no1.getProximo().setInfo(99);

        System.out.print(no2.getInfo());

        // no1 = no2; Perca referencia do no1 = fica disponivel para SO recolher.
        // No no1;
        // No no2;
    }
}
