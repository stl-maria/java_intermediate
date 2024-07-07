package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo
    //Lista de objetos do tipo Pessoa
    private List<Pessoa> pessoaLista;

    // Métodos
    //Construtor
    public OrdenacaoPessoas(){
        this.pessoaLista = new ArrayList<>();
    }

    //exibindo
    public void exibindoPessoas(){
        System.out.println(pessoaLista);
    }

    //adicionando
    public void adicionandoPessoa(String nome, int idade, double altura){
        pessoaLista.add(new Pessoa(nome, idade, altura));
    }

    //ordenando por idade
    public List<Pessoa> ordenandoPorIdade(){
        List<Pessoa> idadePessoas = new ArrayList<>(pessoaLista);
        if(!pessoaLista.isEmpty()) {
            Collections.sort(idadePessoas); //compareTo -> método implementado do Comparable
            return idadePessoas;
        } else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    //ordenando por altura
    public List<Pessoa> ordendandoPorAltura(){
        List<Pessoa> alturaPessoas = new ArrayList<>(pessoaLista);
        if(!pessoaLista.isEmpty()){
            Collections.sort(alturaPessoas, new ComparePorAltura()); //classe CompareAltura
            return alturaPessoas;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    // Main
    public static void main(String[]args){
        OrdenacaoPessoas pessoasLista = new OrdenacaoPessoas();

        pessoasLista.adicionandoPessoa("Ana", 100, 1.5);
        pessoasLista.adicionandoPessoa("Lucas", 48, 1.85);
        pessoasLista.adicionandoPessoa("Zelda", 25, 1.81);
        pessoasLista.adicionandoPessoa("Geraldo", 30, 1.65);

        pessoasLista.exibindoPessoas();

        System.out.println("Ordenando por idade: "+pessoasLista.ordenandoPorIdade());
        System.out.println("Ordenando por altura: "+pessoasLista.ordendandoPorAltura());

    }

}
