import Bootcamp.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Devs dev = new Devs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do dev: ");
        dev.setNome(sc.nextLine());
        Bootcamp bootcamp = new Bootcamp();
        System.out.println("Digite o nome do bootcamp: ");
        bootcamp.setNome(sc.nextLine());
        Cursos curso = new Cursos();
        curso.setNome("POO Java");
        curso.setDescricao("Curso Java");
        curso.setCargaHoraria(40);
        bootcamp.getConteudos().add(curso);
        Mentorias mentorias = new Mentorias();
        mentorias.setNome("Mentoria java");
        mentorias.setDescricao("Mentoria de Java basico");
        bootcamp.getConteudos().add(mentorias);
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        double xp=dev.calcularTotalXp();
        System.out.println("XP: "+xp);


    }
}