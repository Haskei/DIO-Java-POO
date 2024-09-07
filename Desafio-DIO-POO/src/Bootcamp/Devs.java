package Bootcamp;
import java.util.*;
public class Devs {
    private String Nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    public Devs(){}
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Voce não está matriculado em nenhum conteudo");
        }
    }
    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }
    public String getNome() {
        return this.Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public Set<Conteudo> getConteudosInscritos() {
        return this.conteudosInscritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return this.conteudosConcluidos;
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
