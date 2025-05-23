public class ExercicioLp{
    public static void main(String args[]){
        StringBuilder teste1 = new StringBuilder(), teste2 = new StringBuilder();
        
        int i=0;
        for(i=0; i<5; i++){
            teste1.append(i);
            System.out.print(teste1);
            teste1.delete(i+1, teste1.length());
        }

        System.out.println();

        for(i=3; i<9; i++){
            teste2.append(i+"c ");
            System.out.print(teste2);
        }
    }
}