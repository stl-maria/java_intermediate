package collections.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Métodos
    //Construtor
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Getters
    public String getNome(){return nome;}
    public int getIdade(){return idade;}
    public double getAltura(){return altura;}

    //toString
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    //ordenar por idade
    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }
}

//Compare por Altura
class ComparePorAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
}
