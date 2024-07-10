package collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main (String[]args) {
        //criando uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usando o BinaryOperator com expressão lambda para somar dois npumeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
                .reduce(0, somar); //identity: 0 = "variavel temporaria"

        /* - implementando o BinaryOperator direto
        int resultado1 = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2) {
                return n1 + n2;
            }
        });
         */

        /* - com lambda
        int resultado2 = numeros.stream().reduce(0, Integer::sum); //soma de todos os elementos da stream
         */
        
        //imprimindo o resultado da soma
        System.out.println("A soma dos elementos é: "+resultado);
    }
}
