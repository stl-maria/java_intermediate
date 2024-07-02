package edu.java.collections.comparable;

//Classe Livro que implementa Comparable
public class Livro implements Comparable<Livro>{
	private String titulo;
	private String autor;
	private int ano;

	// Construtor
	public Livro(String ti, String au, int an) 
	{
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}
	
	//método para ORDENAR livros POR TITULO
	@Override
	public int compareTo(Livro l) {
		//return this.ano - l.ano; -> se fosse ordenar por ano
		return titulo.compareTo(l.titulo);
	}
	
	// Métodos getters para acessar os dados privados
		public String getTitulo() {return titulo;}

		public String getAutor() {return autor;}

		public int getAno() {return ano;}
	
}


