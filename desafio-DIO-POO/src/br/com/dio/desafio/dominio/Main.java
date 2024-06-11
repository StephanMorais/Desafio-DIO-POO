package br.com.dio.desafio.dominio;


public class Main {
	public static void main(String[]args) {
		Curso curso1 =new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("java");
		curso1.setCargaHoraria(8);
		
		
		System.out.println(curso1);
	}

}
