package collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Usada para criar ou fornecer novos objetos de um determinado tipo
public class SupplierExample {
    public static void main(String[]args){

        //Criando Supplier com expressão lambda para fornecer uma saudação personalizada
        //Supplier recebe um argumento do tipo T (String)
        Supplier<String> saudacao = () //não recebe nenhum argumento
                -> "Olá, seja bem vindo(a)"; //porém retorna um resultado do mesmo tipo T (String)

        //Usar o Supplier para obter uma lista com 5 audações
        //List recebe um argumento do tipo T (String) para as saudações
        List<String> listaSaudacoes =
                Stream.generate(saudacao) //utilizando a interface Stream com o método generate que recebe o Supplier (saudacao)
                        .limit(5) //quantas vezes quero imprimir a saudacao
                       // .collect(Collectors.toList());
                        .toList(); //de forma mais simplificada para colocar as saudacoes geradas em uma List

        /*Implementado o Supplier direto no generate
        List<String> listaSaudadecoes = Stream.generate(() -> "Olá, seja bem vindo(a)")
                .limit(5)
                        .toList();
         */

        //Imprimir as saudacoes geradas
        //listaSaudacoes.forEach(e -> System.out.println(e));
        listaSaudacoes.forEach(System.out::println); //de outra forma com o método reference
        
    }
}
