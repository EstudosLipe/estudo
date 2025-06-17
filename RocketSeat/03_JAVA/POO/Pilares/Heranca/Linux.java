public class Linux {
    public void terminal() {
        System.out.println("Iniciando o terminal\n");
    }

    public void gerenciadoTarefas() {
        terminal();
        System.out.println("Abrindo gerenciado de tarefas\n");
        System.out.println("CPU (uso): " + this.statusCpu() + "%");
        System.out.println("Memoria RAM (uso): " + this.statusMemoriaRam() + "%");
        System.out.println("Armazenamento Disponível: " + this.armazenamentoLivre() + "G");
    }

    private int statusCpu() {
        return 70;
    }

    private int statusMemoriaRam() {
        return 50;
    }

    private int armazenamentoLivre(){
        return 378;
    }
}