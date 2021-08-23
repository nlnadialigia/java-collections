package stream;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
  public static void main(String[] args) {
    List<String> numerosAleatorios =
        Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    System.out.println("Imprimir todos os elementos da lista de String: ");
    numerosAleatorios.forEach(System.out::println);

//    numerosAleatorios.stream().forEach(System.out::println);

/*    numerosAleatorios.stream().forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });*/

    System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
    numerosAleatorios.stream()
        .limit(5)
        .collect(Collectors.toSet())
        .forEach(System.out::println);
    /* O resultado são apenas 4 números pois o Set não aceita números repetidos */

    Set<String> collectSet = numerosAleatorios.stream()
            .limit(5)
                .collect(Collectors.toSet());
    System.out.println("\nCollectSet: " + collectSet);

    System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");
    numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList())
        .forEach(System.out::println);

    List<Integer> collectList = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    System.out.println("\nCollectList: " + collectList);

    System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
    numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(x -> x % 2 == 0 && x > 2)
        .collect(Collectors.toList())
        .forEach(System.out::println);
    List<Integer> collectParMaiorDois = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(y -> y % 2 == 0 && y > 2)
        .collect(Collectors.toList());
    System.out.println("\nCollect Pares Maiores que 2: " + collectParMaiorDois);

    System.out.println("\nMostre a média dos números: ");
    numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);

    System.out.println("\nRemova os valores ímpares: ");
    /* Como o stream não muda a lista, não será utilizado neste exemplo */
    collectList.removeIf(x -> x % 2 != 0);
    System.out.println(collectList);

    System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
    numerosAleatorios.stream()
            .skip(3).forEach(System.out::println);

    System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? ");
    Set<String> numerosNaoRepetidos = new HashSet<>(numerosAleatorios);
    System.out.println("Utilizando Set: " + numerosNaoRepetidos.size());

    long contarNumerosNaoRepetidos = numerosAleatorios.stream()
        .distinct()
        .count();
    System.out.println("Utilizando Stream: " + contarNumerosNaoRepetidos);

    System.out.print("\nMostre o menor valor da lista: ");
    List<Integer> collectNumbers = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    collectNumbers.stream()
        .mapToInt(Integer::intValue)
        .min()
        .ifPresent(System.out::println);

    System.out.print("\nMostre o maior valor da lista: ");
    collectNumbers.stream()
        .mapToInt(Integer::intValue)
        .max()
        .ifPresent(System.out::println);

    System.out.println("\nPegue apenas os números ímpares e some: ");
    Integer somaNumerosImpares = collectNumbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println(somaNumerosImpares);

    System.out.println("\nMostre a lista na ordem númerica: ");
    List<Integer> numerosOrdenados = collectNumbers.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println(numerosOrdenados);

    System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");
    System.out.println("Collect Numbers: " + collectNumbers);
    List<Integer> numerosImparesMultiplosTresOuCinco = collectNumbers.stream()
        .filter(x -> x % 3 == 0 | x % 5 == 0)
        .collect(Collectors.toList());
    System.out.println("Minha solução: " + numerosImparesMultiplosTresOuCinco);

    Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = collectNumbers.stream()
        .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
    System.out.println("Solução do professor: " + collectNumerosMultiplosDe3E5);


  }
}
