import java.util.Random;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        Random random = new Random();

        do {
            if (random.nextBoolean()) {

                if (pilha.push(random.nextInt(10))) {
                    System.out.println("Foi empilhado");
                } else {
                    System.err.println("Falha ao em pilhar");
                }

            } else {
                if (!pilha.pilhaVazia()) {
                    System.out.println(pilha.pop() + " Foi desimpilhado");
                }
            }

            System.out.println(pilha);
        } while (!pilha.pilhaVazia());
    }
}