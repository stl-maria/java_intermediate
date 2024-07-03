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
	
	//Pesquisar por titulo
	public List<Livro> pesquisaPorTitulo
	
}
