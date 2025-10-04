public class TesteList {
    public static void main(String[] args) {
        Lista list = new Lista();

        list.insIncio(10);
        list.insIncio(45);
        list.insIncio(1917);
        System.out.println("Lista: "+list);
        System.out.println(list.remInicio() + " Saiu do inicio\n");
        System.out.println("Lista: "+list);
        list.insFim(14);
        list.insFim(25);
        list.insFim(159);
        list.insFim(9);
        System.out.println("Lista: "+list);
        System.out.println(list.remFim() + " Saiu do inicio\n");
        System.out.println("Lista: "+list);
    }
    

}
