package set;

import java.util.*;

public class Exercicio01 {
  public static void main(String[] args) {
    System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
    Set<String> coresArcoIris = new HashSet<>();
    coresArcoIris.add("violeta");
    coresArcoIris.add("anil");
    coresArcoIris.add("azul");
    coresArcoIris.add("verde");
    coresArcoIris.add("amarelo");
    coresArcoIris.add("laranja");
    coresArcoIris.add("vermelho");
    System.out.println(coresArcoIris);

    System.out.println("Exiba todas as cores uma abaixo da outra:");
    for (String cor: coresArcoIris) System.out.println(cor);

    System.out.println("A quantidade de cores que o arco-íris tem: ");
    System.out.println(coresArcoIris.size());

    System.out.println("Exiba as cores em ordem alfabética");
    Set<String> ordemAlfabetica = new TreeSet<>(coresArcoIris);
    System.out.println(ordemAlfabetica);

    System.out.println("Exiba as cores na ordem inversa da que foi informada");
    List<String> coresEmLista = new ArrayList<>(ordemAlfabetica);
    Collections.reverse(coresEmLista);
    System.out.println(coresEmLista);

    System.out.println("Exiba todas as cores que começam com a letra ”v”");
    for (String cor: coresArcoIris) {
      if (cor.startsWith("v")) System.out.println(cor);
    }

    System.out.println("Remova todas as cores que não começam com a letra “v”");
    coresArcoIris.removeIf(cor -> !cor.startsWith("v"));
    System.out.println(coresArcoIris);

    System.out.println("Limpe o conjunto");
    coresArcoIris.clear();
    System.out.println(coresArcoIris);

    System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());



  }
}
