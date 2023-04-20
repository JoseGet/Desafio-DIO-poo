import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();

        curso1.setTitulo(" curso java");
        curso1.setDescricao(" descricao curso java");
        curso1.setCargaHoraria(8);
        curso1.setValor(100.00);
        
        Curso curso2 = new Curso();

        curso2.setTitulo(" curso js");
        curso2.setDescricao(" descricao curso js");
        curso2.setCargaHoraria(4);
        curso2.setValor(200.00);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("mentoria do curso de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Kotlin Back-end");
        bootcamp.setDescricao("Descricao bootcamp Kotlin");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev  devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jose: " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("Conteudos inscritos Jose: " + devJose.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jose: " + devJose.getConteudoConcluidos());
        System.out.println("XP : " + devJose.carcularXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudoConcluidos());
        System.out.println("XP : " + devJoao.carcularXp());


        

    }
}
