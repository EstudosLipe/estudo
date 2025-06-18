import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.crypto.Data;

public class Livro {
    private int isbn;
    private String titulo;
    private boolean disponibilidade;
    private LocalDate dataCadastro, dataAtulizacao;
    private Autor autor;

    public Livro(int isbn, String titulo, boolean disponibilidade, String dataCadastro, String dataAtulizacao, Autor autor){
        setIsbn(isbn);
        setTitulo(titulo);
        setDisponibilidade(disponibilidade);
        setDataCadastro(dataCadastro);
        setDataAtulizacao(dataAtulizacao);
        setAutor(autor);
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public void setDataCadastro(String dataCadastro) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dataCadastro = LocalDate.parse(dataCadastro, formatter);
    }

    public LocalDate getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataAtulizacao(String dataAtulizacao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dataAtulizacao = LocalDate.parse(dataAtulizacao, formatter);
    }

    public LocalDate getDataAtulizacao() {
        return this.dataAtulizacao;
    }

}