package set.ordenacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
  public static void main(String[] args) {
    System.out.println("--\tOrdem aleatória\t--");
    Set<Serie> minhasSeries = new HashSet<>() {{
      add(new Serie("got", "fantasia", 60));
      add(new Serie("dark", "drama", 60));
      add(new Serie("that '70s show", "comédia", 25));
    }};

    for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

    System.out.println("--\tOrdem inserção\t--");
    Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
      add(new Serie("got", "fantasia", 60));
      add(new Serie("dark", "drama", 60));
      add(new Serie("that '70s show", "comédia", 25));
    }};

    for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

    System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

    System.out.println("--\tOrdem nome, gênero e tempo de episódio\t--");
    Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNGTE());
    minhasSeries3.addAll(minhasSeries);
    System.out.println("MINHAS SÉRIES");
    for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());
    System.out.println("MINHAS SÉRIES3");
    for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());
  }
}
