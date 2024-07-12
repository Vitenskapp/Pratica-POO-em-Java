import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso da linguagem Java");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Curso da linguagem Python");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria da linguagem Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp de Java Development");
        bootcamp.setDescricao("Bootcamp de programação em Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println(devVinicius.calcularTotalXp());
        System.out.println("Conteúdos inscritos:" + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devVinicius.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteúdos inscritos:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos:" + devJoao.getConteudosConcluidos());

    }
}