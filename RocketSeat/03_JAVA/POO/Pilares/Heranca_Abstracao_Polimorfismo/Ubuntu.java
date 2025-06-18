public class Ubuntu extends Linux {
    private int cpu;
    private int memoriaRam;
    private int armazenamento;

    public void terminal() {
        System.out.println("Abrindo o terminal do UBUNTU");
    }

    public void gerenciadoTarefas() {
        System.out.println("CPU (USO): "+getCpu());
        System.out.println("MEMORIA RAM "+getMemoriaRam());
        System.out.println("ARMAZENAMENTO: "+getArmazenamento()+"GB");
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getArmazenamento() {
        return this.armazenamento;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getCpu() {
        return this.cpu;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return this.memoriaRam;
    }
}
