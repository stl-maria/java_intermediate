package collections.list.operacoes_basicas;

public class Item { //objeto Produtos
	// Atributos
	private String nome;
	private double preco;
	private int quantidade;
	
	// Métodos
	//Construtor
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Getters
	public String getNome() {return nome;}
	public double getPreco() {return preco;}
	public int getQuantidade() {return quantidade;}
	
	//toString
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}
