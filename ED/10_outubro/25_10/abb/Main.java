
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Tree tree = new Tree();

        Random random = new Random();

        for (int i = 1; i < 20; i++) {
            int n = random.nextInt(100);
            // System.out.print(" " + n + " ");
            tree.insert(n);
        }
        System.out.println();
        System.out.println(tree.verify(40));
    }
}