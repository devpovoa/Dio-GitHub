package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("descrição curso Js");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devThiagoPovoa = new Dev();
		devThiagoPovoa.setNome("Thiago Povoa");
		devThiagoPovoa.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscrito Thiago : " + devThiagoPovoa.getConteudosInscritos());
		devThiagoPovoa.progressao();
		devThiagoPovoa.progressao();
		devThiagoPovoa.progressao();
		System.out.println("Conteúdos Inscrito Thiago : " + devThiagoPovoa.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Thiago : " + devThiagoPovoa.getConteudosConcluidos());
		System.out.println("Experiência adquirida: " + devThiagoPovoa.calulcarTotalXp());
	}
}
