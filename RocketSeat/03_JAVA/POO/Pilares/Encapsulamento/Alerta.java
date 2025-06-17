public class Alerta {

    public Alerta(){

    }

    public void emitirStatus(){
        System.out.println("Status do seu sistema: ");
        switch (this.verificaStatus()) {
            case 1:
                System.err.println("Cuidado sistema em perigo");
                break;
            case 2:
                System.err.println("URGENTE: sistema em estado de perigo");
                break;
            default:
                System.out.println("Sistema em perfeito estado");
                break;
        }
        salvarLogStatus();
    }

    // public void verificaStatus(){
    //     System.out.println("Verificando o status do sistema");
    // }
    private int verificaStatus(){
        // Grau de Status: 0 - OK; 1 - Warning; 2 - Critical;
        return 1;
    }

    // public void salvarLogStatus(){
    //     System.out.println("Salvando LOG");
    // }
    private void salvarLogStatus(){
        System.out.println("Salvando LOG");
    }

    // public void emitirLogStatus(){
    //     System.out.println("Emitindo LOG de status");
    // }
    private void emitirLogStatus(){
        System.out.println("Emitindo LOG de status");
    }
}
