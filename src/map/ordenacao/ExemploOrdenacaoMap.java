package map.ordenacao;

import java.util.*;

public class ExemploOrdenacaoMap {
  public static void main(String[] args) {

    System.out.println("******\tOrdem aleatória\t******");
    Map<String, Livro> livros = new HashMap<>() {{
      put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
      put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
      put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
    }};
    for (Map.Entry<String, Livro> livro: livros.entrySet()){
      System.out.println("=> " + livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println("******\tOrdem Inserção\t******");
    Map<String, Livro> livros1 = new LinkedHashMap<>(){{
      put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
      put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
      put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
    }};
    for (Map.Entry<String, Livro> livro: livros1.entrySet()){
      System.out.println("=> " + livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println("******\tOrdem alfabética autores\t******");
    Map<String, Livro> livros2 = new TreeMap<>(livros);
    for (Map.Entry<String, Livro> livro: livros2.entrySet()){
      System.out.println("=> " + livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println("******\tOrdem alfabética nomes dos livros\t******");
    Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
    livros3.addAll(livros.entrySet());
    for (Map.Entry<String, Livro> livro: livros3){
      System.out.println("=> " + livro.getKey() + " - " + livro.getValue().getNome());
    }


    System.out.println("******\tOrdem número de página\t******");
    Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPaginas());
    livros4.addAll(livros.entrySet());
    for (Map.Entry<String, Livro> livro: livros4){
      System.out.println("=> " + livro.getKey() + " - " + livro.getValue().getNome());
    }
  }
}
