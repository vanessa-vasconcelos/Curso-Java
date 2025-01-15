package lambdas_secao;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
  public static void main(String[] args) {
    
    Supplier<List<String>> umaLista = 
        () -> Arrays.asList("Anna", "Bia", "Lia");
    System.out.println(umaLista.get());
  }
}
