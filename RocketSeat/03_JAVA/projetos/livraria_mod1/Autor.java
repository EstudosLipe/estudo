import java.time.LocalDate;

public class Autor {
    private int id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(int id, String nome, String dataNascimento) {
        setId(id);
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
