package collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // Atributo
    private Map<String, String> dicionario;

    // Métodos
    //Construtor
    public Dicionario(){this.dicionario = new HashMap<>();}

    //Adicionando palavra
    public void adicionandoPalavra(String palavra, String significado){dicionario.put(palavra, significado);} //put = add

    //Removendo palavra
    public void removendoPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra); //como a chave é unica, não é necessário fazer o for para percorrer os elementos
        }
    }

    //Exibindo palavra
    public void exibindoPalavra(){
        System.out.println(dicionario);
    }

    //Pesquisando por palavra e retornando sua definição
    public String pesquisandoPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if(definicao != null){
            return definicao;
        }
        return "Linguagem não encontrada.";
    }

    // Main
    public static void main (String[]args) {
        // criando o objeto
        Dicionario dicionarioPalavras = new Dicionario();

        //adicionando
        dicionarioPalavras.adicionandoPalavra("queijo", "Produto obtido pela fermentação da coalhada, submetida à compressão e posta a secar no cincho.");
        dicionarioPalavras.adicionandoPalavra("mulher", "Pessoa do sexo feminino ou do gênero feminino.");
        dicionarioPalavras.adicionandoPalavra("tempo", "Duração relativa das coisas que cria no ser humano a ideia de presente, passado e futuro; período contínuo no qual os eventos se sucedem.");
        dicionarioPalavras.adicionandoPalavra("energia","Capacidade que um corpo, uma substância ou um sistema físico têm de realizar trabalho.");

        //exibindo
        dicionarioPalavras.exibindoPalavra();

        //removendo
        dicionarioPalavras.removendoPalavra("tempo");
        dicionarioPalavras.exibindoPalavra();

        //pesquisando
        System.out.println("Pesquisando o significado da palavra queijo: "+dicionarioPalavras.pesquisandoPalavra("queijo"));

    }

}
