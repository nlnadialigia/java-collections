package set.exercicio02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio02 {
  public static void main(String[] args) {
    Set<LinguagemFavorita> linguagens = new HashSet<>() {{
      add(new LinguagemFavorita("Python", 1991, "Pycharm"));
      add(new LinguagemFavorita("Javascript", 1995, "Visual Studio Code"));
      add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
    }};
    for (LinguagemFavorita linguagem: linguagens) System.out.println(linguagem);

    System.out.println("******\tOrdem de Inserção\t******");
    Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(linguagens);
    for (LinguagemFavorita linguagem: linguagens1) System.out.println(linguagem);

    System.out.println("******\tOrdem Natural (nome)\t******");
    Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
    for (LinguagemFavorita linguagem: linguagens2) System.out.println(linguagem);

    System.out.println("******\tOrdem IDE\t******");
    Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIDE());
    linguagens3.addAll(linguagens);
    for (LinguagemFavorita linguagem: linguagens3) System.out.println(linguagem);

    System.out.println("******\tOrdem de ano de criação e nome\t******");
    Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoNome());
    linguagens3.addAll(linguagens);
    for (LinguagemFavorita linguagem: linguagens3) System.out.println(linguagem);

    System.out.println("******\tOrdem de nome, ano de criação e ide\t******");
    Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorAll());
    linguagens3.addAll(linguagens);
    for (LinguagemFavorita linguagem: linguagens3) System.out.println(linguagem);




  }
}
