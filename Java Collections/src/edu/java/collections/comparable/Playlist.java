package edu.java.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

	public static void main(String[] args) {
		ArrayList<Music> playlist = new ArrayList<Music>()
		{
			{
				//adicionando "musicas"
				add(new Music("Guay", "Bad Gyal", 2024, 9));
				add(new Music("Fiebre", "Bad Gyal", 2016, 10));
				add(new Music("Chulo", "Bad Gyal", 2023, 9));
				add(new Music("Tra", "Bad Gyal and Soto Asa", 2018, 10));
				add(new Music("Quema", "Peso Pluma", 2024, 10));
				add(new Music("Todo o nada", "Anitta and Lunay", 2021, 10));
				add(new Music("Tu eres un bom bom", "Bad Gyal and Kafu Banton", 2020, 10));
				add(new Music("Hello Kitty", "OH!DULCEARi", 2020, 8));
			}
		};
		
		Collections.sort(playlist);
		System.out.println("- Musicas após ordenação:\n");
		for (Music musica : playlist) //percorrer pelas musicas
		{
			System.out.println(
					"Avaliação: "+musica.getAvaliacao()+" - "+musica.getCantor()+" - "+musica.getMusica()+" - "+musica.getAno()
			);
		}
		
	}

}
