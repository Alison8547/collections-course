package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Juliana");
        estudantes.add("Alison");
        estudantes.add("Vinicius");
        estudantes.add("Matheus");
        estudantes.add("Tiago");
        estudantes.add("Pedro");
        estudantes.add("José");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior números de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor números de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com a letra 'a' no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("a")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));


        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console. E retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retorna nenhuma coleção
        System.out.print("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Contem algum nome com a letra 'W' ?: " + estudantes.stream().allMatch(elemento -> elemento.contains("w")));

        System.out.println("Tem algum elemento com a minúscula no nome ?: " + estudantes.stream().anyMatch(elemento -> elemento.contains("a")));

        System.out.println("Não tem nenhum elemento com a minúscula no nome ?: " + estudantes.stream().noneMatch(elemento -> elemento.contains("a")));

        System.out.println("Retorna o primeiro elemento: " + estudantes.stream().findFirst());

        System.out.print("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));


    }
}
