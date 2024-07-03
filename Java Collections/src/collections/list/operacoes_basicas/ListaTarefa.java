package collections.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	//Atributo
	private List<Tarefa> tarefaList; //criando tarefaList do tipo List da coleção Tarefa
	
	//Método
	//Construtor
	public ListaTarefa() {
		this.tarefaList = new ArrayList<Tarefa>(); //para que sempre eu criar uma List ela venha já vazia para eu ir adicionando e removendo conforme desejado
	}
	
	//Adicionar tarefa
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao)); //adicionado uma tarefa list com a descricao (parametro informado)
	}
	
	//Removendo tarefa
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<Tarefa>(); //criando lista vazia para remover, a lista irá inserir as descrições das tarefas que forem iguais ao parametro indicado
		for (Tarefa t : tarefaList) {//laço de repetição para percorrer as tarefas da tarefaList que será removida
			if(t.getDescricao().equalsIgnoreCase(descricao)) { //se "descricao" for igual ao elementos da tarefaList, irá adiconar na lista tarefaParaRemover
				tarefaParaRemover.add(t); //vai adicionar na lista de elementos que serão removidos, tarefaParaRemover
			}
		}
		tarefaList.removeAll(tarefaParaRemover); //irá remover tudo da lista que criamos para remover da tarefaList
	}
	
	//Obter numero total de tarefas
	public int obterNumeroTotalTarefas() { //int pois irá retornar um numero inteiro (quantidade de elementos da lista de tarefas)
		return tarefaList.size(); //size: tamanho
	}
	
	//Imprimir descricao das tarefas
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	
	public static void main (String[]args) {
		ListaTarefa listaTarefa = new ListaTarefa(); //criando objeto do tipo ListaTarefa
		
		System.out.println("Número total de elementos na lista: "+listaTarefa.obterNumeroTotalTarefas());;
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 1");
		
		System.out.println("Número total de elementos na lista: "+listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}
}
