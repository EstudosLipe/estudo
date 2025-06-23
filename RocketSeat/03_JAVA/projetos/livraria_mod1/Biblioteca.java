import java.util.Scanner;

public class Biblioteca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ISBN = 0, j = 0;
        Autor autor[] = new Autor[2];
        autor[0] = new Autor(1, "J. R. R. Tolkien", "1892-01-03");
        autor[1] = new Autor(2, "J. K. Rowling", "1965-07-31");

        Livro livros[] = new Livro[2];
        livros[0] = new Livro(1, "Senhor dos anéis", true, "1945-10-23", "2025-10-23", autor[0]);
        livros[1] = new Livro(2, "Harry Potter e a pedra filosofal", true, "1997-10-23", "2022-07-12", autor[1]);

        Livro meusLivros[] = new Livro[3];
        ;

        System.out.println(
                "Bem-vindo a Biblioteca do Philip\n\nEscolha uma opção\n1 - Visualizar livros\n2 - Listar Autores\n0 - sair");
        int i = sc.nextInt();
        while (i != 0) {
            switch (i) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    listarLivros(livros);
                    break;
                case 2:
                    listarAutores(autor);
                    break;
                case 3:
                    // Emprestimo do livro
                    if (j < 3) {
                        listarLivros(livros);
                        System.out.print("Digite o ISBN do seu livro\n-> ");
                        ISBN = sc.nextInt();
                        meusLivros[j] = new Livro(emprestimo(ISBN, livros));
                        break;
                    } else {
                        System.out.println("Você deve devolver algum do seus livros");
                    }
            }
            System.out.print("Deseja algo mais?\n-> ");
            i = sc.nextInt();
            j++;
        }

        sc.close();
    }

    public static void listarLivros(Livro livros[]) {

        for (int i = 0; i < livros.length; i++) {
            System.out.println(
                    "ISBN: " + livros[i].getIsbn() +
                            "\nTitulo: " + livros[i].getTitulo() +
                            "\nAutor: " + livros[i].getDataAtulizacao() + "\n" + livros[i].getAutor().getNome() + "\n" +
                            "\nData de Cadastro: " + livros[i].getDataCadastro() +
                            "\nData de Atualização: " + livros[i].getDataAtulizacao());
        }
    }

    public static void listarAutores(Autor autor[]) {
        for (int i = 0; i < autor.length; i++) {
            System.out.println("ID: " + autor[i].getId() +
                    "\nNome: " + autor[i].getNome() +
                    "\nDN: " + autor[i].getDataNascimento() + "\n");
        }
    }

    public static Livro emprestimo(int ISBN, Livro livros[]) {
        if (livros[ISBN].getDisponibilidade()) {
            return livros[ISBN];
        } else {
            System.out.println("Livro Disponivel");
            return null;
        }

    }
}