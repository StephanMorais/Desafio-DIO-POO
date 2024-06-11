package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	protected int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return titulo  + " Descrição " +descricao + " Carga Horária: " +cargaHoraria;
				
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return xp_padrao*cargaHoraria;
	}
	

}
	
	
	
	
	
	

