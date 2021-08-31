package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String Nome;
	private String Cor;
	private Integer Idade;

	public Gato() {
	}

	public Gato(String nome, String cor, Integer idade) {
		Nome = nome;
		Cor = cor;
		Idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cor, Idade, Nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(Cor, other.Cor) && Objects.equals(Idade, other.Idade) && Objects.equals(Nome, other.Nome);
	}

	@Override
	public String toString() {
		return "Gato [Nome=" + Nome + ", Cor=" + Cor + ", Idade=" + Idade + ", getNome()=" + getNome() + ", getCor()="
				+ getCor() + ", getIdade()=" + getIdade() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
