// package Desafio Fundamentos;

public class VarEConst {
  public static void main(String[] args) {
    final double FATOR = 5 / 9.0;
    final int AJUSTE = 32;

    double fahrenheit = 86;
    double temperatura = (fahrenheit - AJUSTE) * FATOR;

    System.out.println(temperatura);
  }
}
