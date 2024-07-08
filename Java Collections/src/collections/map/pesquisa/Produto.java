package collections.map.pesquisa;

public class Produto {
    // Atributos
    private String produto;
    private int quantidade;
    private double preco;

    // Métodos
    //Construtor
    public Produto(String produto, int quantidade, double preco){
        this.produto = produto;
        this.quantidade = quantidade;
        this. preco = preco;
    }

    //Getters
    public String getProduto(){return produto;}
    public int getQuantidade(){return quantidade;}
    public double getPreco(){return preco;}

    //toString
    @Override
    public String toString() {
        return "{" +
                "produto='" + produto + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
