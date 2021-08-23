package map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Desafio {
  public static void main(String[] args) {
    Random gerador = new Random();
    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < 100;  i++) {
      numbers.add(gerador.nextInt(6) + 1);
    }

    System.out.println(numbers);

    int qtde1 = 0;
    int qtde2 = 0;
    int qtde3 = 0;
    int qtde4 = 0;
    int qtde5 = 0;
    int qtde6 = 0;
    for (int number : numbers) {
      if (number == 1) qtde1++;
      if (number == 2) qtde2++;
      if (number == 3) qtde3++;
      if (number == 4) qtde4++;
      if (number == 5) qtde5++;
      if (number == 6) qtde6++;
    }
    System.out.println("Número 1: " + qtde1);
    System.out.println("Número 2: " + qtde2);
    System.out.println("Número 3: " + qtde3);
    System.out.println("Número 4: " + qtde4);
    System.out.println("Número 5: " + qtde5);
    System.out.println("Número 6: " + qtde6);
  }
}
