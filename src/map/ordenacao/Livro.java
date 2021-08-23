package map.ordenacao;

import java.util.Objects;

public class Livro {
  final private String nome;
  final private Integer paginas;

  public Livro(String nome, Integer paginas) {
    this.nome = nome;
    this.paginas = paginas;
  }

  public String getNome() {
    return nome;
  }

  public Integer getPaginas() {
    return paginas;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", paginas=" + paginas +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Livro livro = (Livro) o;
    return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, paginas);
  }
}
