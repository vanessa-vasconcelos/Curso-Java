import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import teste.Aluno01;

public class Reduce02 {
  public static void main(String[] args) {

    Aluno01 a1 = new Aluno01("Anna", 7.1);
    Aluno01 a2 = new Aluno01("Luna", 6.1);
    Aluno01 a3 = new Aluno01("Kate", 8.1);
    Aluno01 a4 = new Aluno01("Marcos", 10);

    List<Aluno01> alunos = Arrays.asList(a1, a2, a3, a4);

    Predicate<Aluno01> aprovado = a -> a.nota >= 7;
    Function<Aluno01, Double> apenasNota = a -> a.nota;
    BinaryOperator<Double> somatorio = (a, b) -> a + b;

    alunos.stream()
      .filter(aprovado)
      .map(apenasNota)
      .reduce(somatorio)
      .ifPresent(System.out::println);
  }
}
