import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Um curso de java");
        curso1.setCargaHoraria(93);

        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin");
        curso2.setDescricao("Um curso de Kotlin");
        curso2.setCargaHoraria(40);

        Conteudo conteudo = new Curso();      // Polimorfismo
        Conteudo mentoria = new Mentoria();   // Polimorfismo
        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Uma mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro : " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteudos Inscritos Pedro : " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro : " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXP());

        System.out.println("\n\n");

        Dev devFranco = new Dev();
        devFranco.setNome("Franco");
        devFranco.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Franco : " + devFranco.getConteudosInscritos());
        devFranco.progredir();
        System.out.println("Conteudos Inscritos Franco : " + devFranco.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Franco : " + devFranco.getConteudosConcluidos());
        System.out.println("XP: " + devFranco.calcularTotalXP());


    }
}
