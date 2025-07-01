import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class JavaNIO {
    public static void main(String agrs[]) {

        // Cria um diretório
        File exemploArquivos = new File("exemploArquivos");
        if (!exemploArquivos.exists()) {
            exemploArquivos.mkdir();
        }
        try {
            // Cria um arquivo qualquer
            File json = new File(exemploArquivos, "teste.txt");
            json.createNewFile();
        } catch (Exception e) {
            System.out.println("Pasta não encontrada. Cria Manual carai!!!");
        }

        // Leitura do arquivo
        try {
            Path path = Paths.get("exemploArquivos\\teste.txt");

            // Captura os bytes do arquivo
            byte bytesTeste[] = Files.readAllBytes(path);

            // Converte para string instanciando um objeto, assim sendo 1 forma possível para leitura dos dados
            String conteudo = new String(bytesTeste);
            System.out.println(conteudo);

            // Leitura de cada Linha do arquivo (util para JSONs)
            List<String> lines = Files.readAllLines(path);
            lines.forEach(l -> System.out.println(l));

            

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
