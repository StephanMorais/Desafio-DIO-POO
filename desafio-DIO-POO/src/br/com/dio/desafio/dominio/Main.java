package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[]args) {
		Curso curso1 =new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 =new Curso();
		curso1.setTitulo("curso js");
		curso1.setDescricao("java script");
		curso1.setCargaHoraria(6);
		
		
		Mentoria mentoria=new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp=new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila=new Dev();
		devCamila.setNome("Camila");
		
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println(devCamila.calcularXp());
		System.out.println("Conteudos Inscritos"+devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos"+devCamila.getconteudosConcluidos());
		
		devCamila.progredir();
		System.out.println(devCamila.calcularXp());
		System.out.println("Conteudos Inscritos"+devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos"+devCamila.getconteudosConcluidos());
		
		
		Dev devJoao =new Dev();
		devJoao.setNome("João");
		System.out.println("Conteudos Inscritos"+devJoao.getConteudosInscritos());
	
	
	}

}
