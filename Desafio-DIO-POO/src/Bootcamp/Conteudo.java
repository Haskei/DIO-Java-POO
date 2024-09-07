package Bootcamp;

public abstract class Conteudo {
    protected static double XP_PADRAO=10d;
    private String nome;
    private String descricao;
    public abstract double calcularXp();
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
}
