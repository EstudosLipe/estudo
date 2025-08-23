public class NovoTesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(4);
        for (int i = 0; i < 7; i++) {
            v.insertElement(i);
        }
        // System.out.println(v.removeElement());

        NossoVetor teste = v.cloneObject(v);

        System.out.println("teste:\n" + teste);
        System.out.println("v:\n" + v);
    }
}
