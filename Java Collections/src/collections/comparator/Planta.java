package collections.comparator;

import java.util.Comparator;

public class Planta {
	
	// Atributos
	private String nome;
	private String nomeFamilia;
	private double altura; //metros
	
	// Métodos
	
	//Construtos
	public Planta(String nome, String nomeFamilia, double altura)
	{
		this.nome = nome;
		this.nomeFamilia = nomeFamilia;
		this.altura = altura;
	}
	
	//getters para acessar od dados
	public String getNome() {return nome;}
	public String getNomeFamilia() {return nomeFamilia;}
	public double getAltura() {return altura;}
}

//Ordenando as plantas pelo nome
class CompareNome implements Comparator<Planta>{

	@Override
	public int compare(Planta o1, Planta o2) 
	{
		return o1.getNome().compareTo(o2.getNome());
	}
	
}

//Ordenando por nomeFamilia
class CompareNomeFamilia implements Comparator<Planta>{

	@Override
	public int compare(Planta o1, Planta o2) {
		return o1.getNomeFamilia().compareTo(o2.getNomeFamilia());
	}
	
}

//Ordenando por altura
class CompareAltura implements Comparator<Planta>{

	@Override
	public int compare(Planta o1, Planta o2) {
		return Double.compare(o1.getAltura(), o2.getAltura());
	}
	
}
