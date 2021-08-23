package stream;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
  public static void main(String[] args) {

    System.out.println("===\tOrdem aleatória\t===");
    Map<Integer, Contato> agenda = new HashMap<>() {{
      put(1, new Contato("Simba", 2222));
      put(4, new Contato("Cami", 5555));
      put(3, new Contato("Jon", 1111));
    }};
    System.out.println(agenda);
    for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
    }

    System.out.println("===\tOrdem de inserção\t===");
    Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
      put(1, new Contato("Simba", 2222));
      put(4, new Contato("Cami", 5555));
      put(3, new Contato("Jon", 1111));
    }};
    for (Map.Entry<Integer, Contato> entry: agenda.entrySet()){
      System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
    }

    System.out.println("====\tOrdem de id\t===");
    Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
    for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()){
      System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
    }

    System.out.println("===\tOrdem número de telefone\t===");
    /* NEW COMPARATOR */
    /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
      @Override
      public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
      }
    });*/

    /* COMPARING */
    /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
        new Function<Map.Entry<Integer, Contato>, Integer>() {
          @Override
          public Integer apply(Map.Entry<Integer, Contato> cont) {
            return cont.getValue().getNumero();
          }
        }
    ));*/

    /* CLASSE ANÔNIMA */
    Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
        cont -> cont.getValue().getNumero()
    ));

    set.addAll(agenda.entrySet());
    for (Map.Entry<Integer, Contato> entry: set) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
    }

    System.out.println("===\tOrdem de nome do contato\t===");
    Set<Map.Entry<Integer, Contato>> setName = new TreeSet<>(Comparator.comparing(
        name -> name.getValue().getNome()
    ));
    setName.addAll(agenda.entrySet());
    for (Map.Entry<Integer, Contato> entry: setName) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
    }
  }
}
