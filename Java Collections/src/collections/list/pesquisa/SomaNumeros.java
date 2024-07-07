package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // Atributos
    private List<Integer> numeroLista;

    // Métodos
    //Construtor
    public SomaNumeros(){
        this.numeroLista = new ArrayList<>();
    }

    //adicionando
    public void adicionarNumero(int numero){
        this.numeroLista.add(numero);
    }

    //calculando soma
    public int calculandoSoma(){
        int soma = 0;
        for(Integer n : numeroLista)
            soma += n;
        return soma;
    }
    //encontrar MAIOR numero
    public int maiorNumero() {
        int numeroMaior = Integer.MIN_VALUE; //o menor possivel do tipo int
        if (!numeroLista.isEmpty()) {
            for (Integer n : numeroLista) {
                if (n >= numeroMaior) //se n for maior ou igual ao menor numero possivel do tipo n
                    numeroMaior = n;
            }
            return numeroMaior;
        }else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    //encontrar MENOR numero
    public int menorNumero(){
        int numeroMenor = Integer.MAX_VALUE; //maior valor ppssivl do tipo int
        if(!numeroLista.isEmpty()){
            for(Integer n : numeroLista){
                if(n <= numeroMenor) //se n for menor ou igual ao maior numero possivel do tipo int
                    numeroMenor = n;
            }
            return numeroMenor;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    //exibir numeros
    public void exibirNumeros(){
        if(!numeroLista.isEmpty())
            System.out.println(this.numeroLista);
        else
            throw new RuntimeException("Lista vazia");
    }


    // Main
    public static void main (String[]args) {
        SomaNumeros somar = new SomaNumeros();
        somar.adicionarNumero(2);
        somar.adicionarNumero(3);
        somar.adicionarNumero(1000);
        somar.adicionarNumero(-100);

        somar.exibirNumeros();

        System.out.println("A soma dos numeros é: "+somar.calculandoSoma());
        System.out.println("O maior numero da lista é: "+somar.maiorNumero());
        System.out.println("O menos numero da lista é: "+somar.menorNumero());
    }
}
