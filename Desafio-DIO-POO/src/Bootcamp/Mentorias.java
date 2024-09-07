package Bootcamp;
import java.time.*;
public class Mentorias extends Conteudo{
    private LocalDate dataMentoria =LocalDate.now();
    public Mentorias() {}

    @Override
    public double calcularXp() {
        return XP_PADRAO +20d;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

}
