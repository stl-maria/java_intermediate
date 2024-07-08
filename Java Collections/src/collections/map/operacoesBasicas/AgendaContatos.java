package collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;//int
	
	// Métodos
	//Construtor
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	//Adicionar
	public void adicionarContato (String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	//Remover
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome); //como a chave é unica, não é necessário fazer o for para percorrer os elementos
		}
	}
	
	//Exibir
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	//Pesquisa por nome e retorna  telefone
	public Integer pesquisaPorNome (String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}

	// Main
	public static void main (String[]args){
		//criando
		AgendaContatos agenda = new AgendaContatos();

		//adicionando
		agenda.adicionarContato("Lucas", 12345678);
		agenda.adicionarContato("Lulu", 87654321);
		agenda.adicionarContato("Maria", 11122233);
		agenda.adicionarContato("Rosie", 52457893);
		agenda.adicionarContato("Natalia", 45125786);
		agenda.adicionarContato("Ana", 32458716);

		//exibindo
		agenda.exibirContato();

		//removendo
		agenda.removerContato("Lucas");

		agenda.exibirContato();

		//pesquisando pelo nome e retornando o telefonde do contato
		System.out.println("O numero da Maria é: "+agenda.pesquisaPorNome("Maria"));

	}
	
}
