package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup;

public class CarrinhoDeCompras {
	// Atributo
	private List<Item> comprasList;
	
	// Métodos
	//Construtor
	public CarrinhoDeCompras() {
		this.comprasList = new ArrayList<Item>(); //construir o objeto com uma lista vazia
	}
	
	//Adicionar
	public void adicionarItem(String nome, double preco, int quantidade) {
		comprasList.add(new Item(nome, preco, quantidade));
	}
	
	//Remover
	public void removerItem(String nome) {
		List<Item> comprasParaRemover = new ArrayList<Item>(); //lista para selecionar os itens que serão excluidos
		//Laço para percorrer
		for (Item i : comprasList) {
			if (i.getNome().equalsIgnoreCase(nome)) { //se i for igual ao nome do item que desejo excluir
				comprasParaRemover.add(i); //adicionando i na lista de comprar para remover
			}
		}
		comprasList.removeAll(comprasParaRemover);
	}
	
	//Valor total do carrinho
	public double calcularValorTotal() {
		double somaTotal=0;
		if (!comprasList.isEmpty()){
			for(Item i:comprasList){
				double somaItem = i.getPreco() * i.getQuantidade();
				somaTotal += somaItem;
			}
		}
		return somaTotal;
	}

	//Exibir todos itens
	public void exibirItens() {
		System.out.println(comprasList);
	}

	// Main
	public static void main(String[] args){
		CarrinhoDeCompras compras = new CarrinhoDeCompras();

		compras.adicionarItem("pão",10, 1);
		compras.adicionarItem("sabonete", 10, 2);

		System.out.println("Valor total dos itens: "+compras.calcularValorTotal());
	}
	
}
