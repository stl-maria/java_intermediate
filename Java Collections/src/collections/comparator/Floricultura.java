package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Floricultura {

	public static void main(String[] args) {
		List<Planta> plantas = new ArrayList<Planta>() {
			{
				//adicionando (nome, nomeFamilia e altura -m-)
				add(new Planta("Papiro Brasileiro", "Cyperaceae", 3.40));
				add(new Planta("Planta Mosaico", "Onagraceae", 0.3));
				add(new Planta("Sombrinha chinesa", "Cyperaceae", 1.80));
				add(new Planta("Vitória Regia", "Nymphaeaceae", 2.5));
			}
		};
		
		//Por nome:
		System.out.println("- Ordenando por nome:");
		Collections.sort(plantas, new CompareNome());
		for (Planta planta : plantas)
			System.out.println(
					"Nome da planta: "+planta.getNome()+" - "+planta.getNomeFamilia()+" - "+planta.getAltura()
			);
		
		//Por nome da familia:
		System.out.println("\n- Ordenando por nome da família:");
		Collections.sort(plantas, new CompareNomeFamilia());
		for (Planta planta : plantas)
			System.out.println(
					"Nome da família: "+planta.getNomeFamilia()+" - "+planta.getNome()+" - "+planta.getAltura()
			);
		
		//Por altura:
		System.out.println("\n- Ordenando por altura:");
		Collections.reverseOrder((new CompareAltura())); //ordenando altura de forma reversa (do maior para o menor)
		//Collections.sort(plantas, new CompareAltura()); //ordenando da forma "normal" (do menor para o maior)
		for (Planta planta : plantas)
			System.out.println(
					"Altura da planta: "+planta.getAltura()+" - "+planta.getNome()+" - "+planta.getNomeFamilia()
			);
		
	}
	

}
