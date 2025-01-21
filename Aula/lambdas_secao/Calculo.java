package Aula.lambdas_secao;

@FunctionalInterface
public interface Calculo {
  
  double executar(double a, double b);

  default String lega(){
    return "legal";
  }

  static String muitoLegal(){
    return "muito legal";
  }
}
