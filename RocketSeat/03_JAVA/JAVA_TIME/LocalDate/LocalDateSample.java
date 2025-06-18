import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample{
    public static void main(String args[]){
        // Imprime a data Atual
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        // Imprime uma data especificada
        dataAtual = LocalDate.of(2040, 12, 1);
        System.out.println(dataAtual);

        // Imprime uma data a partir da soma de dias.
        dataAtual = LocalDate.ofEpochDay(1000000000);
        System.out.println(dataAtual);

        // Converte texto em data
        dataAtual = LocalDate.parse("2006-01-31");
        System.out.println(dataAtual);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataAtual = LocalDate.parse("31/01/2006",formatter);
        System.out.println(dataAtual);

    }
}