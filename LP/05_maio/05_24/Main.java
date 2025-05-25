public class Main {
    public static void main(String[] args) {
        Aluno philip=new Aluno(); //Instanciando um objeto

        //Acessando e populando seus atributos
        philip.nome = "Philip Viana";
        philip.curso = "ADS";
        philip.periodo = 2;
        
        //Acessando e executando seus metódos
        philip.imprimirAluno();
        System.out.println();
        Aluno jessika=new Aluno(); //Instanciando um objeto

        //Acessando e populando seus atributos
        jessika.nome = "Jessika Viana";
        jessika.curso = "RH";
        jessika.periodo = 4;

        //Acessando e executando seus metódos
        jessika.imprimirAluno();
        System.out.println();
    }    
}
