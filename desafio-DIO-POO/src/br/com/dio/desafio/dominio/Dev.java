package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo>conteudosInscritos=new LinkedHashSet<>();
	private Set<Conteudo> SetConteudo=new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {}
	
	public void progredir() {}
	
	public void calcularXp() {}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getSetConteudo() {
		return SetConteudo;
	}

	public void setSetConteudo(Set<Conteudo> setConteudo) {
		SetConteudo = setConteudo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(SetConteudo, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(SetConteudo, other.SetConteudo)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}