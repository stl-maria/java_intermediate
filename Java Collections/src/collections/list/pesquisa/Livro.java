package collections.list.pesquisa;

public class Livro {
	// Atributo
	private String titulo;
	private String autor;
	private int ano;
	
	// Métodos
	//Construtor
	public Livro (String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	//Getters
	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public int getAno() {return ano;}

	//toString
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
	}
	
}
