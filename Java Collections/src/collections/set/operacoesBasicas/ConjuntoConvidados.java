package collections.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	// Atributo
	private Set<Convidado> convidadoSet;
	
	// Métodos
	//Construtor
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	
	//Adicionando convidado
	public void adicionarConvidado(String nome, int codigo) {
		convidadoSet.add(new Convidado(nome, codigo));
	}
	
	//Remover
	public void removerConvidadoCodigo(int codigo) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigo) {
				convidadoParaRemover = c;
				break;	
			} else {
				System.out.println("Não existe convidado com o código de convite informado.");
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	//Contar
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	//Exibir
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	
	// Main
	public static void main(String[]args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Caio", 1);
		conjuntoConvidados.adicionarConvidado("Marcelo", 13);
		conjuntoConvidados.adicionarConvidado("Bruna", 59);
		conjuntoConvidados.adicionarConvidado("Lorena", 3);
		conjuntoConvidados.adicionarConvidado("Monica", 5);
		conjuntoConvidados.adicionarConvidado("Ana", 13); //Não foi adicionada, pois o código do convite é igual ao do Marcelo
		
		conjuntoConvidados.exibirConvidados(); //--------------
		
		conjuntoConvidados.removerConvidadoCodigo(1);
		
		conjuntoConvidados.exibirConvidados(); //--------------
		
		System.out.println(conjuntoConvidados.contarConvidados());
		
	}
	
}
