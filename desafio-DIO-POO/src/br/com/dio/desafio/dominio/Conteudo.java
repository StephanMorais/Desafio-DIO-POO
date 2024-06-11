package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	protected static final double xp_padrao =10;
	protected String titulo;
	protected String descricao;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static double getXpPadrao() {
		return xp_padrao;
	}

	
	
	public abstract double calcularXp();
	
	
	

}
