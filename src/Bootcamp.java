import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();
    private final Set<Dev> devsInscritos = new LinkedHashSet<>();

    public Bootcamp(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
        this.dataFim = dataInicio.plusDays(45);
    }

    public Bootcamp(LocalDate dataInicio, int duracaoBootcamp) {
        this.dataInicio = dataInicio;
        this.dataFim = dataInicio.plusDays(duracaoBootcamp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
