package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
  public static void main(String[] args) {

    List<Gato> meusGatos = new ArrayList<>(){{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 12, "amarelo"));
    }};

    System.out.println("--\tOrdem de Inserção\t---");
    System.out.println(meusGatos);

    System.out.println("--\tOrdem aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Natural (Nome)\t---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Idade\t---");
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);

    System.out.println("--\tOrdem cor\t---");
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);

  }
}

