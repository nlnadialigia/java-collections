package set.ordenacao;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
  private String nome;
  private String genero;
  private int tempoEpisodio;

  public Serie(String nome, String genero, int tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public int getTempoEpisodio() {
    return tempoEpisodio;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", genero='" + genero + '\'' +
        ", tempoEpisodio=" + tempoEpisodio +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Serie serie = (Serie) o;
    return tempoEpisodio == serie.tempoEpisodio && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, genero, tempoEpisodio);
  }


  @Override
  public int compareTo(Serie o) {
    int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
    if (tempoEpisodio != 0) return tempoEpisodio;
    return this.getGenero().compareTo(o.getGenero());
  }
}
