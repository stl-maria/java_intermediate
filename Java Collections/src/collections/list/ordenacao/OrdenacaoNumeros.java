package collections.list.ordenacao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    // Atributos
    private List<Integer> numerosInteiros;

    // Métodos
    //Construtor
    public OrdenacaoNumeros(){ this.numerosInteiros = new ArrayList<>();}

    //Adicionando
    public void adicionandoNumero(int n){
        this.numerosInteiros.add(n);
    }

    //Ordenando Ascendente
    public List<Integer> ordenandoAscendente(){
        List<Integer> ascendente = new ArrayList<>(this.numerosInteiros);
        if(!numerosInteiros.isEmpty()){
            Collections.sort(ascendente);
            return ascendente;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    //Ordenando Descendente
    public List<Integer> ordenandoDescendente() {
        List<Integer> ascendente = new ArrayList<>(this.numerosInteiros);
        if(!numerosInteiros.isEmpty()){
            ascendente.sort(Collections.reverseOrder());
            return ascendente;
        } else {
            throw new RuntimeException("A lista esta vazia.");
        }
    }

    // Main
    public static void main(String[]args){
        OrdenacaoNumeros numerosLista = new OrdenacaoNumeros();

        numerosLista.adicionandoNumero(5);
        numerosLista.adicionandoNumero(7);
        numerosLista.adicionandoNumero(45);
        numerosLista.adicionandoNumero(1);
        numerosLista.adicionandoNumero(11);

        System.out.println("Ordenando por ascendente: "+numerosLista.ordenandoAscendente());
        System.out.println("Ordenando por descendente: "+numerosLista.ordenandoDescendente());

    }

}
