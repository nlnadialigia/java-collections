package set.exercicio02;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    return CharSequence.compare(o1.getIde(), o2.getIde());
  }
}
