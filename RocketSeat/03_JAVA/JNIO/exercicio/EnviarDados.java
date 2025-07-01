public class EnviarDados {
    public static void main(String args[]) {
        Dados dados[][] = {
            {new Dados(8321485886L, "Joemia Giron Lyrio Monnerat")},
            {new Dados(27056726L, "Reginaldo Folly Barboza Brito")},
            {new Dados(9124168455L, "Mariza Gadelha Bastida Carneiro")},
            {new Dados(6832598389L, "Mirian Venancio Portela Ignacia")},
        };

        System.out.println(dados[0][0].getTelefone());
    }
}
