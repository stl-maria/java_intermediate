package collections.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collections.comparable.Livro;

public class Biblioteca {

	//private static final Comparator Titulo = null;

	public static void main(String[] args ) {
		List<Livro> livros = new ArrayList<Livro>() { //lista de livros
			{
				//adicionando livros
				add(new Livro("Para Sempre", "Alyson Noel", 2009));
				add(new Livro("Lua Azul","Alyson Noel", 2009));
				add(new Livro("Lua Nova","Stephanie Meyer", 2006));
				add(new Livro("Eclipse","Stephanie Meyer", 2007));
				add(new Livro("Halo", "Alexandra Adornetto", 2011));
				add(new Livro("Tormenta", "Lauren Kate", 2012));
				add(new Livro("Se eu morrer antes de você", "Allison Brennan", 2020));
			}
		};
		
		//Ordenar por titulo:
		//1- Criar o objeto de TituloCompare
		//2- Chamar Collections.sort
		//3- Imprimir a lista ordenada
		System.out.println("- Ordenando por titulo:");
		Collections.sort(livros, new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
				return l1.getTitulo().compareTo(l2.getTitulo());
			}
		});
		
		//Collections.sort(livros, new AutorCompare()); //qual a lista e como ordenar
		for (Livro livro : livros)
			System.out.println(
					livro.getAutor()+" - "+livro.getTitulo()
			);
		
		
		//Ordenar por autor
		System.out.println("\n- Ordenando por autor:");
		Collections.sort(livros, new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
				return l1.getAutor().compareTo(l2.getAutor());
			}
		});
		for (Livro livro : livros)
			System.out.println(
					livro.getAno()+" - "+livro.getAutor()
			);
				
		
		
	}

}
