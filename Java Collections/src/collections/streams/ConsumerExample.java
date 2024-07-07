package collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Usado para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor
public class ConsumerExample {
    public static void main(String[]args){
        //criando uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,6,7,8,9);

        //Usando o Consumer com expressao Lambda para imprimir números pares
        //Consumer recebe um argumento do tipo T (Integer)
        Consumer<Integer> imprimirNumeroPar = numero -> { //só está imprimindo, não está retornando nada
            if (numero % 2 == 0) //se o resto da divisão por 2 for 0
                System.out.println(numero);
        };

        numeros.stream() //tranformando a lista em stream
                .forEach(imprimirNumeroPar); //forEach recebe um Consumer

        /* - implementando um Consumer
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
        });
        */

        /* - implementando com Lambda
        numeros.forEach(n -> {  // não há necessidade de chamar o stream()
            if (n % 2 == 0)
                System.out.println(n);
        });
        */
    }



}
