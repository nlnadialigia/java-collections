package set.exercicio02;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
    if (ano != 0) return ano;

    return CharSequence.compare(o1.getNome(), o2.getNome());
  }
}
