import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import teste.Aluno01;

public class Filter {
  public static void main(String[] args) {
    
    Aluno01 a1 = new Aluno01("Ana", 7.8);
    Aluno01 a2 = new Aluno01("Bia", 5.8);
    Aluno01 a3 = new Aluno01("Daniel", 9.8);
    Aluno01 a4 = new Aluno01("Gui", 6.8);
    Aluno01 a5 = new Aluno01("Rebeca", 7.1);
    Aluno01 a6 = new Aluno01("Pedro", 8.8);

    List<Aluno01> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

    Predicate<Aluno01> aprovado = a -> a.nota >= 7;
    Function<Aluno01, String> saudacao = a -> "Parabéns " + a.nome + "! Você foi aprovado";
   
    alunos.stream()
      .filter(aprovado)
      .map(saudacao)
      .forEach(System.out::println);

  }
}
