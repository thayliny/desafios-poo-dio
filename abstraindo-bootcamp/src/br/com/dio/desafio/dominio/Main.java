package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static  void main( String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curos();
        curso2.setTitulo(" Curso JavaScript");
        curso2.setDescricao(" descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("Mentoria Java");
        mentorias.setDescricao("Mentoria Java");
        mentorias.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentorias); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentorias);

        Dev devThayliny = new Dev();
        devThayliny.setNome("Thayliny");
        devThayliny.inscreverBootcamp(bootcamp);
        System.out.println ("Conteudos Incritos" + devThayliny.getConteudoInscritos());
        devThayliny.progredir();
        System.out.println ("Conteudos Concluidos" + devThayliny.getConteudosConcluidos());
        System.out.println("XP:",devThayliny.calcularTotalXp());

        Dev devCamila  = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println ("Conteudos Incritos" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println ("Conteudos Concluidos" + devThayliny.getConteudosConcluidos());
        System.out.println("XP:",devCamila.calcularTotalXp());
    }



}
