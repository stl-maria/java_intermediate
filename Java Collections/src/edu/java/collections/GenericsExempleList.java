package edu.java.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {

	public static void main(String[] args) {
		
		/*Exemplo sem Generics
		ArrayList listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 1");  //-> adicionando dado do tipo String
		listaSemGenerics.add(10);  //-> adicionando outro dado do tipo int, permite adicionar qualquer tipo de objeto
		
		System.out.println(listaSemGenerics);
		
		//iterando (percorrendo) sobre a lista sem Generics -> necessário fazer cast)
		for (Object elemento : listaSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
		*/
		
		//Exemplo com Generics
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");
		 
		//iterando (percorrendo) sobre a lista com Generics
		for (String elemento : listaGenerics) {
			System.out.println(elemento);
		}
		
		
	}

}
