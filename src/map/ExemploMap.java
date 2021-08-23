package map;

import java.util.*;

public class ExemploMap {
  public static void main(String[] args) {
    System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
    Map<String, Double> carros = new HashMap<>() {{
      put("gol", 14.4);
      put("uno", 15.6);
      put("mobi", 16.1);
      put("hb20", 14.5);
      put("kwid", 15.6);
    }};

    System.out.println(carros);

    System.out.println("Substitua o consumo do gol por 15,2 km/l");
    carros.put("gol", 15.2);
    System.out.println(carros);

    System.out.println("Confira se o modelo tucson está no dicionário");
    System.out.println(carros.containsKey("tucson"));

    System.out.println("Exiba o consumo do uno: " + carros.get("uno"));

    System.out.println("Exiba os modelos");
    Set<String> modelos = carros.keySet();
    System.out.println(modelos);

    System.out.println("Exiba os consumos dos carros");
    Collection<Double> consumos = carros.values();
    System.out.println(consumos);

    System.out.println("Exiba o modelo mais econômico e seu consumo");
    Double consumoMaisEconomico = Collections.max(carros.values());
    Set<Map.Entry<String, Double>> entries = carros.entrySet();
    String modeloMaisEconomico = "";
    for (Map.Entry<String, Double> entry: entries) {
      if (entry.getValue().equals(consumoMaisEconomico)){
        modeloMaisEconomico = entry.getKey();
        System.out.println(modeloMaisEconomico + " - " + consumoMaisEconomico);
      }
    }

    System.out.println("Exiba o modelo menos econômico e seu consumo");
    Double consumoMenosEconomico = Collections.min(carros.values());
    Set<Map.Entry<String, Double>> entries1 = carros.entrySet();
    String modeloMenosEconomico = "";
    for (Map.Entry<String, Double> entry: entries1){
      if (entry.getValue().equals(consumoMenosEconomico)){
        modeloMenosEconomico = entry.getKey();
        System.out.println(modeloMenosEconomico + " - " + consumoMenosEconomico);
      }
    }

    System.out.println("Exiba a soma dos consumos");
    Double soma = 0d;
    for (Double aDouble : carros.values()) {
      soma += aDouble;
    }
    System.out.println(soma);

    System.out.println("Exiba a média dos consumos deste dicionário de carros");
    Double media = soma / carros.size();
    System.out.println(media);

    System.out.println(carros);

    System.out.println("Remova os modelos com o consumo igual a 15,6 km/l");
    carros.values().removeIf(aDouble -> aDouble.equals(15.6));
    System.out.println(carros);

    System.out.println("Exiba todos os carros na ordem em que foram informados");
    Map<String, Double> carros2 = new LinkedHashMap<>(){{
      put("gol", 14.4);
      put("uno", 15.6);
      put("mobi", 16.1);
      put("hb20", 14.5);
      put("kwid", 15.6);
    }};
    System.out.println(carros2);

    System.out.println("Exiba o dicionário ordenado pelo modelo");
    Map<String, Double> carros3 = new TreeMap<>(){{
      put("gol", 14.4);
      put("uno", 15.6);
      put("mobi", 16.1);
      put("hb20", 14.5);
      put("kwid", 15.6);
    }};
    System.out.println(carros3);

    System.out.println("Apague o dicionario de carros");
    carros.clear();
    System.out.println(carros);

    System.out.println("Confira se o dicionário está vazio: " + carros.isEmpty());



  }
}
