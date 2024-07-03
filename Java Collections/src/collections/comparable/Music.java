package collections.comparable;

public class Music implements Comparable<Music>{
	
	// Atributos
	private String cantor;
	private String musica;
	private int ano;
	private double avaliacao;
	
	// Métodos
	//Construtor
	public Music(String musica, String cantor, int ano, double avaliacao) 
	{
		this.musica = musica;
		this.cantor = cantor;
		this.ano = ano;
		this.avaliacao = avaliacao;
	}
	
	//Método para ordenar
	@Override
	public int compareTo(Music o) 
	{
		//return cantor.compareTo(o.cantor); //ordenar por cantor
		//return musica.compareTo(o.musica); //ordenar por musica
		//return this.ano-o.ano; //ordenar por ano
		return (int) (this.avaliacao-o.avaliacao); //ordenar por avaliação
	}
	
	//Métodos getters para acessar os dados
	public String getCantor() {return cantor;}
	public String getMusica() {return musica;}
	public int getAno() {return ano;}
	public double getAvaliacao() {return avaliacao;}
	
}
