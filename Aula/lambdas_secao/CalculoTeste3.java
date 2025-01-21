package Aula.lambdas_secao;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
  public static void main(String[] args) {
    
    // NÃO per,ite: int -> Double
    // PERMITE: double -> Double
    BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
    System.out.println(calculo.apply(2.0, 3.0));

    calculo = (x, y) -> x * y;
    System.out.println(calculo.apply(2.0, 3.0));

  }
}
