package br.com.dio.desafio.dominio;

public class Curso {
	
	protected String titulo;
	protected int cargaHoraria;
	protected String descricao;
	
	
	
	public String getDescricao() {
	return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getTitulo() {
		return titulo;
	}

	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return titulo  + descricao + cargaHoraria;
				
	}
	

}
	
	
	
	
	
	

