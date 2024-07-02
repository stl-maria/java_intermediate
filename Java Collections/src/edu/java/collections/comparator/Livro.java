package edu.java.collections.comparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro> 
{
	// Atributos
	
	private String titulo;
	private String autor;
	private int ano;
	
	// Métodos
	//Construtor
	public Livro(String titulo, String autor, int ano)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	//ordenar por titulo
	@Override
	public int compareTo(Livro o) {
		return titulo.compareTo(o.titulo);
	}
	
	//getters para acesar os dados
	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public int getAno() {return ano;}

}

//classe para comparar livros por titulo
class TituloCompare implements Comparator<Livro>{
	//método
	public int compare(Livro l1, Livro l2)
	{
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}


//classe para comparar livros por autor
class AutorCompare implements Comparator<Livro>{
	//método compare
	public int compare(Livro l1,Livro l2)
	{
		return l1.getAutor().compareTo(l2.getAutor());
	}
}

//classe para comparar livros por ano
class AnoCompare implements Comparator<Livro>{
	//método compare
	public int compare(Livro l1, Livro l2)
	{
		return Integer.compare(l1.getAno(), l2.getAno());
		
		/*
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
		*/
		
	}
}
