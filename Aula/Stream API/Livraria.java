import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Livraria {
  public static void main(String[] args) {
    
    Livro livro1 = new Livro("O Pequeno Príncipe", 60, 5);
    Livro livro2 = new Livro("Antes da Queda", 45.5, 4);
    Livro livro3 = new Livro("E O Vento Levou", 85, 5);
    Livro livro4 = new Livro("A Menina Roubava Livros", 75, 2);
    Livro livro5 = new Livro("O Morro dos Ventos Uivantes", 90, 4.5);
    Livro livro6 = new Livro("É Assim que Acaba", 80, 3.5);

    List<Livro> livros = Arrays.asList(livro1, livro2, livro3, livro4, livro5, livro6);

    Predicate<Livro> valor = p -> p.preco <= 80;
    Predicate<Livro> avaliacao = p -> p.avaliacao >= 4;
    Function<Livro, String> livrosSelecionados = 
      p -> "Os livros selecionados foram: " + p.nome;

    livros.stream()
      .filter(valor)
      .filter(avaliacao)
      .map(livrosSelecionados)
      .forEach(System.out::println);
  }
}
