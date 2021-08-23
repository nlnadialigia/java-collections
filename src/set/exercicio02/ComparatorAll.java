package set.exercicio02;

import java.util.Comparator;

public class ComparatorAll implements Comparator<LinguagemFavorita> {
  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    int nome = o1.getNome().compareTo(o2.getNome());
    if (nome != 0) return nome;

    int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
    if (ano != 0) return ano;

    return CharSequence.compare(o1.getIde(), o2.getIde());
  }
}
