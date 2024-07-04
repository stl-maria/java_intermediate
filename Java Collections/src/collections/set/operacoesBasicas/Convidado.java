package collections.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {
	// Atributos
	private String nome;
	private int codigoConvite;
	
	// Métodos
	//Construtor
	public Convidado (String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	//Getters
	public String getNome() {return nome;}
	public int getCodigoConvite() {return codigoConvite;}

	//toString
	@Override
	public String toString() {
		return "Convidado \n[nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}
	
	
	
}
