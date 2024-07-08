package collections.map.pesquisa;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;

public class EstoqueProdutos {
    // Atributo
    private Map<Long, Produto> estoque;

    // Métodos
    //Construtor
    public EstoqueProdutos(){this.estoque = new HashMap<>();}

    //adicionando produto
    public void adicionandoProduto(long idProduto, String produto, int quantidade, double preco){
        estoque.put(idProduto, new Produto(produto,quantidade,preco));
    }

    //exibindo produto
    public void exibindoProduto(){
        System.out.println(estoque);
    }

    //calculando valor total
    public double valorTotal(){
        double somaTotal = 0;
        if(!estoque.isEmpty()){
            for(Produto i : estoque.values()){
                somaTotal += i.getQuantidade() * i.getPreco();
            }
        }
        return somaTotal;
    }

    //produto mais caro
    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoque.values()){
            if (p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    //produto mais barato
    public Produto produtoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoque.values()){
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    //maior quantidade do produto considerando o valor total
    public Produto produtoMaiorQuantidadeMaiorPreco (){
        Produto produtoMaiorQuantidade = null;
        double maiorValorQuantidade = 0;
        if (!estoque.isEmpty()){
            for(Map.Entry<Long, Produto> entry : estoque.entrySet()){
                double valorProduto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorProduto > maiorValorQuantidade){
                    maiorValorQuantidade = valorProduto;
                    produtoMaiorQuantidade = entry.getValue();
                }
            }

        }
        return produtoMaiorQuantidade;
    }

    // Main
    public static void main(String[]args){
        //criando objeto
        EstoqueProdutos produtosNoEstoque = new EstoqueProdutos();

        //adicionando
        produtosNoEstoque.adicionandoProduto(10,"sabao",1,12.0);
        produtosNoEstoque.adicionandoProduto(11, "arroz", 1, 30.0);
        produtosNoEstoque.adicionandoProduto(12, "feijão", 3, 10.0);
        produtosNoEstoque.adicionandoProduto(13, "queijo", 4, 5.0);
        produtosNoEstoque.adicionandoProduto(14,"carne vegetal", 2, 37.5);
        produtosNoEstoque.adicionandoProduto(15, "sal", 2, 11);
        produtosNoEstoque.adicionandoProduto(16, "pão", 8, 0.80);
        produtosNoEstoque.adicionandoProduto(17, "melancia", 9, 26.5);

        //exibindo
        produtosNoEstoque.exibindoProduto();

        //calculando valor total
        System.out.println("Valor total do estoque: "+produtosNoEstoque.valorTotal());

        //produto mais caro
        System.out.println("Produto mais caro: "+produtosNoEstoque.produtoMaisCaro());

        //produto mais barato
        System.out.println("Produto mais barato: "+produtosNoEstoque.produtoMaisBarato());

        //produto mais caro pela quantidade total de itens
        System.out.println("Produto com maior quantidade pelo maior preço: "+produtosNoEstoque.produtoMaiorQuantidadeMaiorPreco());
    }
}
