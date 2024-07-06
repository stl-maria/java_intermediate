package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	// Atributo
	private List<Livro> livroLista;
	
	// Métodos
	//Construtor
	public CatalogoLivros() {this.livroLista = new ArrayList<Livro>();}

	//Adicionando
	public void adicioandoLivro(String titulo, String autor, int ano) {
		livroLista.add(new Livro(titulo, autor, ano));
	}
	
	//Pesquisar por autor
	public List<Livro> pesquisarPorAutor (String autor){
		List<Livro> livrosPorAutor = new ArrayList<Livro>(); //nova lista onde vamos adicionar os elementos (livros) que tiverem o mesmo autor do paramatro
		//se a lista não estiver vazia, irá percorrer pela lista para localizar o autor do parametro
		if (!livroLista.isEmpty()) { //o ! inverte a lógica do "livroLista.isEmpty()"
			for(Livro l : livroLista) { //para percorrer pela lista
				if (l.getAutor().equalsIgnoreCase(autor)) //se for igual ao parametro
					livrosPorAutor.add(l);
			}
		}
		return livrosPorAutor;
	}
	
	//Pesquisar por ano
	public List<Livro> pesquisarPorAno (int anoInicial, int anoFinal){
		List<Livro> livrosPorAno = new ArrayList<Livro>();
		if (!livroLista.isEmpty()) {
			for(Livro l : livroLista) {
				if(l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
					livrosPorAno.add(l);
				}
			}
		}
		return livrosPorAno;
	}
	
	//Pesquisar titulo, imprimir o primeiro que encontrar
	public Livro pesquisaPorTitulo (String titulo ) {
		Livro livroPorTitulo = null;
		if (!livroLista.isEmpty()) {
			for (Livro l : livroLista) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {//o primeiro que foi adicionado, será o primeiro a ser imprimido
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
	// Main
	public static void main (String[]args) {
		//criando uma lista de objetos do tipo "Livro"
		CatalogoLivros catalagoLivros = new CatalogoLivros();

		//adicionando
		catalagoLivros.adicioandoLivro("Titulo 1", "Autor 1", 2000);
		catalagoLivros.adicioandoLivro("Titulo 2", "Autor 2", 2001);
		catalagoLivros.adicioandoLivro("Titulo 3", "Autor 3", 2002);
		catalagoLivros.adicioandoLivro("Titulo 4", "Autor 4", 2003);
		catalagoLivros.adicioandoLivro("Titulo 1", "Autor 3", 2003);
		catalagoLivros.adicioandoLivro("Titulo 2", "Autor 2", 2000);
		catalagoLivros.adicioandoLivro("Titulo 3", "Autor 1", 2000);

		//pesquisando
		System.out.println("Pesquisando por autor: "+catalagoLivros.pesquisarPorAutor("Autor 2"));
		System.out.println("Pesquisando por ano: "+catalagoLivros.pesquisarPorAno(2001, 2002));
		System.out.println("Pesquisando por titulo: "+catalagoLivros.pesquisaPorTitulo("Titulo 1"));
		
	}
	
	
}
