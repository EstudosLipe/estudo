public class Paciente {
    private StringBuffer nomePaciente;
    private String dataNascimento;
    private double peso;
    private double altura; //m
    private int gorduraCorporal;

    // Construtor sem parametros
    public Paciente() {
        this.nomePaciente.append("Paciente Exemplo");
        this.dataNascimento = "31/01/2006";
        this.peso = 107.0;
    }

    // Construtor com parametro
    public Paciente(StringBuffer nome, String dn, double peso) {
        this.nomePaciente.append(nome);
        this.dataNascimento = dn;
        this.peso = peso;
    }

    // Copy COntructor
    public Paciente(Paciente paciente) {
        this.nomePaciente.append(paciente.nomePaciente);
        this.dataNascimento = paciente.dataNascimento;
        this.peso = paciente.peso;
    }

    // Recupe Nome
    public StringBuffer getNome() {
        return nomePaciente;
    }

    // Recupe DN
    public String getDataNascimento() {
        return dataNascimento;
    }

    // Recupera peso
    public double getPeso() {
        return peso;
    }

    // Recupera Gordura Corporal
    public int getGorduraCorporal() {
        return gorduraCorporal;
    }

    // Imprimir dados
    public void imprimirPaciente(Paciente paciente) {
        System.out.print("Nome: " + paciente.getNome() + "\n" + "Data de nascimento: " + paciente.getDataNascimento()
                + "\n" + "Peso: " + paciente.getPeso() + "\n" + "Gordura Corporal: " + paciente.getGorduraCorporal());
    }

    public String verificarSituacao() {

        this.gorduraCorporal = (int) (peso/(Math.pow(2, altura)));

        if (gorduraCorporal < 5) {
            return "Muito magro: menos de 5% de gordura corporal;";
        } else if (gorduraCorporal < 15) {
            return "Magro, abaixo do peso: de 5 a 15% de gordura corporal";
        } else if (gorduraCorporal < 26) {
            return "Peso ideal: de 16 a 25% de gordura corporal";
        } else if (gorduraCorporal < 35) {
            return "Acima do peso:  de  26  a  35%  de  gordura  corporal";
        } else {
            return "Obeso:  mais  de  35%  de  gordura  corporal";
        }
    }

    /*
    */
}