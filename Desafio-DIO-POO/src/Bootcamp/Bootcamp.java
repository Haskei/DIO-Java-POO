package Bootcamp;
import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    String nome;
    String descricao;
    private final LocalDate dataInicial=LocalDate.now();
    private final LocalDate dataFinal= dataInicial.plusDays(45);
    private Set<Devs> devsInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudos= new LinkedHashSet<>();

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

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Devs> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
}
