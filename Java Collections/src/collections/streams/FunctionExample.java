package collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[]args) {
        //Criando uma lista de npumeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usando a Function com expressão lambda para dobrar todos os numeros
        //passando o tipo da entreda e o tipo da saida da Function
        Function<Integer, Integer> dobrar =
                numero //argumento Integer
                        -> numero * 2; //resultado do tipo Integer

        //usando a função para sobrar todos os numeros no Stream e armazenar em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar) //mapear e recebe uma Function (dobrar)
                .toList();

        /* - implementando direto a Function
        List<Integer> numerosDobrados1 = numeros.stream()
                .map(new Function<Integer, Integer>() {
                        //implementado o método
                        @Override
                        public Integer apply(Integer n) {
                            return n * 2;
                        }
                    }
                )
                .toList();
         */

        /* - utilizando o lambda
        List<Integer> numerosDobrados2 = numeros.stream()
                .map(n -> n *2) //recebendo o argumento do tipo T (Integer) e retornando o tipo R (mesmo tipo Integer)
                .toList(); //coletando para uma list;
         */

        //imprimindo a lista de numeros dobrados
        numerosDobrados.forEach(e -> System.out.println(e));
            //com o reference:
            //numerosDobrados.forEach(System.out::println);
    }
}
