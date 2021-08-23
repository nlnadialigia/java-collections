package stream;

public class Contato {
  String nome;
  Integer numero;

  public Contato(String nome, Integer numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public Integer getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", numero=" + numero +
        '}';
  }

}
