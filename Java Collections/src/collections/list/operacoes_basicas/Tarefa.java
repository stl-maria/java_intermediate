package collections.list.operacoes_basicas;

public class Tarefa {
	// Atributo
	private String descricao;
	
	// Método
	//Construtor
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	//Getter
	public String getDescricao() {
		return descricao;
	}
	
	//Método toString
	//Com este método, o método obterDescricoesTarefas() irá imprimir a descrição do elemento e não mais o endereço
	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + "]";
	}
	
	
}
