package collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[]args){
        //criando uma lista de palavras
        List<String> palavras = Arrays.asList("amor", "respiração", "vento", "fogo", "agua", "eletricidade", "veneno", "luz", "amargo", "nuvem");

        //criar um predicate que verfiica se a palavra tem mais de 5 caracteres
        //tipo do argumento String
        Predicate<String> maisDeCincoCaracteres =
                palavra -> palavra.length() > 5; //se for maior do que 5, retorna true, caso contrario, false

        //Criando um Predicate para filtrar as palavras com mais de 5 caracteres e, em seguida
        //imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        /* - implementando o Predicate direto
        palavras.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String p) { //recebe argumento do tipo String e retorna um valor booleano
                return p.length() > 5;
            }
        }).forEach(System.out::println);
         */

        /*- com lambda
        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
        */

    }
}
