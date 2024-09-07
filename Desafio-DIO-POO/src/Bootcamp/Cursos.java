package Bootcamp;

public class Cursos extends Conteudo {
    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO + 10d;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Cursos(){}
}
