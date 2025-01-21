package Aula.OO.rncapsulamento;

public class PessoaTeste {
  public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa(-45);
    p1.setIdade(230); ;

    System.out.println(p1.getIdade());
  }
}
