import java.util.Scanner;

public class CineLipe {
    public static void main(String args[]) {
        // Declaração do obj Scanner
        Scanner sc = new Scanner(System.in);

        // Declarao de OBJs de String/StringBuilder (Para não ficar criando um novo a
        // cada execução dos métodos)
        StringBuilder user[][] = new StringBuilder[3][3];
        String palavras[] = { "Philip", "Kelly", "Sophie", "Jane", "Viana", "Soares" };
        StringBuilder users[][] = users(user, palavras);
        String filmes[][] = {
                { "Um filme chamado Minecraft", "03/04/2025",
                        "Um Filme Minecraft é a primeira adaptação live-action para os cinemas do jogo mais vendido de todos os tempos, Minecraft. Neste universo onde a criatividade não só proporciona diversão como também é vital para a sobrevivência, quatro indivíduos desajustados — Garrett arrett “The Garbage Man” Garrison (Jason Momoa), Henry (Sebastian Eugene Hansen), Natalie (Emma Myers) e Dawn (Danielle Brooks) — são subitamente transportados para o Overworld, um mundo cúbico e bizarro onde a imaginação reina. Após passarem por um portal misterioso, eles se encontram em uma terra repleta de perigos e criaturas malignas, como Piglins e Zumbis. Para retornarem ao seu mundo, eles terão que dominar este novo ambiente com a ajuda de um construtor experiente e imprevisível, Steve (Jack Black). Durante essa jornada mágica, os cinco aventureiros precisarão redescobrir suas habilidades únicas, essenciais não apenas para sobreviver no Overworld, mas também para prosperar na vida real." },
                { "Branca de Neve", "20/03/2025",
                        "Inspirado no conto clássico dos Irmãos Grimm, Branca de Neve ganha uma nova adaptação live-action da Disney. A história acompanha a jovem princesa Branca de Neve (Rachel Zegler), cuja beleza desperta a inveja de sua madrasta, a Rainha Má (Gal Gadot). Determinada a eliminar a enteada, a vilã ordena sua morte, mas Branca de Neve consegue escapar e se refugia na floresta. Lá, encontra uma cabana onde vivem sete anões amigáveis, que a acolhem e se tornam seus aliados. No entanto, o perigo ainda ronda a princesa, pois a Rainha Má tem um plano cruel para eliminá-la de vez: uma maçã envenenada. Além de recontar a icônica jornada da princesa, o filme traz uma abordagem renovada com novas canções originais compostas por Benj Pasek e Justin Paul, responsáveis pelas trilhas de La La Land e O Rei do Show." },
                { "Operação Vingança", "10/04/2025",
                        "Em Operação Vingança, após a trágica morte de sua esposa em um ataque terrorista em Londres, Charles Heller (Rami Malek), um criptógrafo altamente capacitado da CIA, se vê frente a um dilema cruel: sua agência não está disposta a agir, afogada em prioridades internas conflitantes. Desesperado por justiça e com a dor da perda a consumi-lo, Heller toma uma decisão radical. Ele chantageia seus superiores para ser treinado como um agente de campo e, assim, poder perseguir os responsáveis pelo atentado por conta própria. Acompanhado por uma jornada de vingança e auto-descobrimento, Heller se infiltra em um sombrio universo de espionagem e terrorismo internacional. À medida que se aprofunda na trama de conspirações e traições, ele percebe que seus próprios aliados podem ser tão perigosos quanto seus inimigos. O filme é uma tensa mistura de ação e suspense, com o ritmo acelerado e uma narrativa imersiva, que mantém o público na ponta da cadeira. Dirigido por James Hawes e escrito por Gary Spinelli, Operação Vingança é um thriller de espionagem eletricamente carregado, onde a lealdade é testada, e a linha entre justiça e vingança se torna cada vez mais tênue." },
                { "Drop: Ameaça Anônima", "10/04/2025",
                        "Em Drop: Ameaça Anônima, a mãe solteira e viúva Violet (Meghann Fahy) finalmente se arrisca e marca o primeiro encontro com o rapaz que tem conversado online, o charmoso Henry. Durante o jantar num restaurante luxuoso, os dois parecem se dar bem, até que Violet começa a receber mensagens com ameaças de um número desconhecido. Exigindo que ela jogue um jogo, caso contrário seus filhos sofrerão as consequências, Violet precisa seguir as instruções exigidas sem poder mencionar o que está acontecendo para ninguém, muito menos para seu companheiro romântico. Se não fizer o que for pedido, todos que ela ama morrerão. Com diretrizes cada vez mais amedrontadoras, a situação chega em seu nível limite, com seu algoz anônimo obrigando-a a matar Henry. Nesse thriller repleto de suspense e mistério, a confiança do casal é colocada à prova e questionamentos começam a nascer: será que o autor de todo esse esquema é o encantador Henry?" }
        };

        // Campo de digitação do Email/Login
        System.out.print("LOGIN\n\nEmail ou Nome de usuário:\n-> ");
        StringBuilder nome = new StringBuilder(sc.nextLine());

        // Campo de digitação da senha
        System.out.print("\nSenha:\n-> ");
        StringBuilder pass = new StringBuilder(sc.nextLine());

        // Valor setado com 1 para iniciar o looping de uso da aplicação
        int n = 1;

        while (n != 0) {
            int login = login(nome, pass, users);

            if (login == 1) {
                System.out.println("Bem-vindo ao *_CineLipe_*\n");
                System.out.println("1. Comprar ingressos");
                System.out.println("2. Meus Ingressos");

                // Captura do valor de opção selecionada
                n = capturaDados(sc);

                switch (n) {
                    case 1:
                        compraIngresso(filmes, sc);
                        break;
                    case 2:
                        break;
                    default:
                        System.out.print("Tchau Tchau, volte sempre!\n");
                        break;
                }
            } else {
                System.out.print("Nome ou senha incorretos:\nTentar novamente?\n1. Sim\n");
                n = capturaDados(sc);
                if (n == 1) {
                    sc.nextLine();
                    System.out.print("\nEmail ou Nome de usuário:\n-> ");
                    nome.replace(0, nome.length(), sc.nextLine());
                    System.out.print("\nSenha:");
                    pass.replace(0, pass.length(), sc.nextLine());
                }
            }
        }
        sc.close();
    }

    /**
     * Constroi o array de usuários temp (Melhorar com cadastro e registro no BD)
     * 
     * @return
     */
    private static StringBuilder[][] users(StringBuilder user[][], String palavras[]) {
        for (int i = 0; i < user.length; i++) {
            // Nome
            user[i][0] = new StringBuilder();
            user[i][0].append(palavras[i] + " " + palavras[4] + " " + palavras[5]);
            // Email
            user[i][1] = new StringBuilder();
            user[i][1].append(palavras[i].toLowerCase() + "." + palavras[5].toLowerCase() + "@gmail.com");
            // Senha
            user[i][2] = new StringBuilder();
            user[i][2].append(palavras[i] + palavras[4].toLowerCase() + "1@");
        }
        return user;
    }

    private static int capturaDados(Scanner sc) {
        System.out.print("0. Sair\n-> ");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.print("Valor inválido, tente novamente.\n");
            sc.nextLine(); // Limpa o buffer do scanner
            n = capturaDados(sc); // Chama o método novamente para capturar um novo valor
        }
        return n;
    }

    /**
     * Método de Login no CineLipe
     * 
     * @param nome {StringBuilder} Name User ou email do user
     * @param pass {StringBuilder} Senha do user
     * @return {int} Logado ou não
     */
    public static int login(StringBuilder nome, StringBuilder pass, StringBuilder users[][]) {
        for (int i = 0; i < users.length; i++) {
            if ((nome.toString().equals(users[i][0].toString()) || nome.toString().equals(users[i][1].toString()))
                    && pass.toString().equals(users[i][2].toString())) {
                // Logado
                return 1;
            }
        }
        // Não foi Logado
        return 0;
    }

    public static void compraIngresso(String filmes[][], Scanner sc) {
        System.out.println("Qual filme deseja escolher");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + ". " + filmes[i][0]);
        }

        int n = capturaDados(sc);
        if (n != 0) {
            visualizarFilme(filmes, filmes[n - 1], sc);
        }
    }

    public static void visualizarFilme(String filmes[][], String filme[], Scanner sc) {
        System.out.println(filme[0] + "\n");
        System.out.println("Data de Lançamento: " + filme[1] + "\n");
        System.out.println("Sinopse: " + filme[2] + "\n");

        System.out.println("Vamos comprar um ingresso?");

        // Captura do valor de opção selecionada
        System.out.print("1. Sim\n\n ");
        int n = capturaDados(sc);
        if (n == 1) {
            escolherPoltronas();
        } else if (n == 0) {
            compraIngresso(filmes, sc);
        }
    }

    public static void escolherPoltronas() {
        System.out.println("Escolher poltrona");
    }
}