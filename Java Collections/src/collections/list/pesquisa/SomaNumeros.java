package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // Atributos
    private List<Integer> numeroLista;

    // Métodos
    //Construtor
    public SomaNumeros(int numero){
        this.numeroLista = new ArrayList<>();
    }

    
    //toString
    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeroLista=" + numeroLista +
                '}';
    }

    //adicionando
    public void adicionarNumero(int numero){
        numeroLista.add(numero);
    }

    //calculando soma

    //encontrar maior numero

    //encontrar menor numero

    //exibir numeros
    public void exibirNumeros(){
        System.out.println(numeroLista);
    }


    // Main
    public static void main (String[]args) {
        SomaNumeros somar = new SomaNumeros();
        somar.adicionarNumero(2);
        somar.adicionarNumero(3);
        somar.exibirNumeros();
    }
}
