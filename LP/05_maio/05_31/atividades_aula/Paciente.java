public class Paciente {
    private StringBuffer nomePaciente=new StringBuffer("");
    private String dataNascimento;
    private double peso;
    private double altura; // m
    private int gorduraCorporal;

    // Construtor sem parametros
    public Paciente() {
        setNome("Paciente Exemplo");
        setDataNascimento("31/01/2006");
        setPeso(107.0);
        setAltura(1.78);
    }

    // Construtor com parametro
    public Paciente(String nome, String dn, double peso, double altura) {
        setNome(nome);
        setDataNascimento(dn);
        setPeso(peso);
        setAltura(altura);
        setGorduraCorporal(peso, altura);
    }

    // Copy COntructor
    public Paciente(Paciente paciente) {
        setNome(paciente.nomePaciente.toString());
        setDataNascimento(paciente.dataNascimento);
        setPeso(peso);
        setAltura(altura);
    }

    // Recupe Nome
    public StringBuffer getNome() {
        return nomePaciente;
    }

    public void setNome(String nome) {
        this.nomePaciente.replace(0,nomePaciente.length(), nome);
    }

    // Recupe DN
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dn) {
        this.dataNascimento = dn;
    }

    // Recupera peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Recupera Gordura Corporal
    public int getGorduraCorporal() {
        this.gorduraCorporal = (int) (peso / (Math.pow(2, altura)));
        return gorduraCorporal;
    }
    public void setGorduraCorporal(double peso, double altura){
        this.gorduraCorporal = (int) (peso / (Math.pow(2, altura)));
    }


    // Imprimir dados
    public void imprimirPaciente() {
        System.out.print("Nome: " + getNome() + "\n" + "Data de nascimento: " + getDataNascimento()
                + "\n" + "Peso: " + getPeso() + "\n" +"Altura: " + getAltura() + "m\n" + "Gordura Corporal: " + getGorduraCorporal()+"%");
    }

    public String verificarSituacao() {
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