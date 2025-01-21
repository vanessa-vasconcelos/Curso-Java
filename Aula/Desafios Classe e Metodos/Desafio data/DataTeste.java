// package Desafios Classe e Metodos.Desafio data;

public class DataTeste {
  public static void main(String[] args) {
    
    Data d1 = new Data(23, 01, 2002);

    var d2 = new Data();
    // d2.dia = 18;
    // d2.mes = 11;
    // d2.ano = 2024;

    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());

    d1.imprimirDataFormatada();
    d2.imprimirDataFormatada();
  }
}
