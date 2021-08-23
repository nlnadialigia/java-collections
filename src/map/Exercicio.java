package map;

import java.sql.SQLOutput;
import java.util.*;

public class Exercicio {
  public static void main(String[] args) {

    System.out.println("Crie um dicionário e relacione os estados e suas populações");
    Map<String, Integer> estados = new HashMap<>() {{
      put("PE", 9616621);
      put("AL", 3351543);
      put("CE", 9187103);
      put("RN", 3534265);
    }};

    for (Map.Entry<String, Integer> estado: estados.entrySet()){
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println("********************************************************");

    System.out.println("Substitua a população do estado do RN por 3.534.165");
    estados.put("RN", 3534165);
    for (Map.Entry<String, Integer> estado: estados.entrySet()){
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println("********************************************************");

    System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -\n" +
        "4.039.277;");
    if (!estados.containsKey("PB")) {
      System.out.println("Adicionando PB...");
      estados.put("PB", 4039277);
    }
    for (Map.Entry<String, Integer> estado: estados.entrySet()){
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println("********************************************************");

    System.out.println("Exiba a população PE");
    System.out.println(estados.get("PE"));

    System.out.println("********************************************************");

    System.out.println("Exiba todos os estados e suas populações na ordem que foi\n" +
        "informado;");
    Map<String, Integer> estados1 = new LinkedHashMap<>(estados);
    for (Map.Entry<String, Integer> estado: estados1.entrySet()) {
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println("********************************************************");

    System.out.println("Exiba os estados e suas populações em ordem alfabética");
    Map<String, Integer> estados2 = new TreeMap<>(estados);
    for (Map.Entry<String, Integer> estado: estados2.entrySet()) {
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println("********************************************************");

    System.out.println("Exiba o estado com o menor população e sua quantidade");
    Integer menorPopulacao = Collections.min(estados.values());
    Set<Map.Entry<String, Integer>> entries = estados.entrySet();
    for (Map.Entry<String, Integer> entry: entries) {
      if (entry.getValue().equals(menorPopulacao)) {
        System.out.println(entry.getKey() + " - " + entry.getValue());
      }
    }

    System.out.println("********************************************************");

    System.out.println("Exiba o estado com a maior população e sua quantidade");
    Integer maiorPopulacao = Collections.max(estados.values());
    Set<Map.Entry<String, Integer>> entries1 = estados.entrySet();
    for (Map.Entry<String, Integer> entry: entries1) {
      if (entry.getValue().equals(maiorPopulacao)){
        System.out.println(entry.getKey() + " - " + entry.getValue());
      }
    }

    System.out.println("********************************************************");

    System.out.println("Exiba a soma da população desses estados");
    Integer soma = 0;
    for (Map.Entry<String, Integer> estado: estados.entrySet()) {
      soma += estado.getValue();
    }
    System.out.println(soma);

    System.out.println("********************************************************");

    System.out.println("Exiba a média da população deste dicionário de estados");
    System.out.println(soma/estados.size());

    System.out.println("********************************************************");

    System.out.println("Remova os estados com a população menor que 4.000.000");
    System.out.println(estados);
    estados.values().removeIf(estado -> estado < 4000000);
    System.out.println(estados);

    System.out.println("********************************************************");

    System.out.println("Apague o dicionário de estados");
    estados.clear();
    System.out.println(estados);

    System.out.println("********************************************************");

    System.out.println("Confira se o dicionário está vazio");
    System.out.println(estados.isEmpty());
  }
}
