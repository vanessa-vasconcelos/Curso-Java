
public class Jantar {
  public static void main(String[] args) {
    
    Comida comida01 = new Comida("Arroz", 0.200);
    Comida comida02 = new Comida("Feijão", 0.185);
    
    Pessoa pessoa01 = new Pessoa("Maria", 79);

    System.out.println(pessoa01.apresentar());
    pessoa01.comer(comida01);
    System.out.println(pessoa01.apresentar());
    pessoa01.comer(comida02);
    System.out.println(pessoa01.apresentar());
    

  }
}
