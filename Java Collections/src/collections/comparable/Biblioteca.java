package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>() { //lista de livros
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
		
		
		/*
		//imprimindo livros na ordem desejada (no caso é autor 
		Collections.sort(livros);
		System.out.println("- Livros após a ordenanção natural (Titulo): \n");
	        for (Livro livro: livros)
	        {
	        	System.out.println(
	        			"Livro: "+livro.getTitulo()+" - "+livro.getAutor()+" - " +livro.getAno() //apenas irá mostrar da maneira que deseja, pois a ordem em si é determinada no método compareTo
	        	);
	        }
	    */
	}
}
