

public class ValorVsReferencia {
  public static void main(String[] args) {
    
    double a = 2;
    double b = a;

    a++;
    b--;

    System.out.println(a + " " + b); // atrinuição por valor 
    // (Tipo primitivo) 

    Produto d1 = new Produto("Celular", 1024);
    Produto d2 = d1; // atribuição por referência (objeto)

    d1.preco = 1000;
    d2.precoExtra = 12;

    System.out.println(d1.precoComDesconto());
    System.out.println(d2.precoComDesconto());

    voltarParaValorPadrao(d2);

    System.out.println(d1.precoComDesconto());
    System.out.println(d2.precoComDesconto());

    int c = 5;
    alterarPrimitivo(c);
    System.out.println(c);

    }

    static void voltarParaValorPadrao(Produto d){
      d.nome = "Sem nome";
      d.preco = 0;
      d.precoExtra = 0;
  }

  static void alterarPrimitivo(int a){
    a++;
  }
}
