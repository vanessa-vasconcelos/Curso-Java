import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
  public static void main(String[] args) {

    // Com o tipo Object, ele imprime valores de qualquer tipo
    // Consumer<Object> print = System.out::println;
    Consumer<String> print = System.out::print;
    // Consumer<Integer> println = System.out::println;

    Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
    langs.forEach(print);

    String [] maisLangs = { "Python", "Lisp", "Perl", "Goa\n"};

    Stream.of(maisLangs).forEach(print);
    Arrays.stream(maisLangs).forEach(print);

    // Exibe valores do array do índice 1 e 2, o 3 não é mostrado
    Arrays.stream(maisLangs, 1, 3).forEach(print);
    
    List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
    outrasLangs.stream().forEach(print);
    outrasLangs.parallelStream().forEach(print);

    // Formas de gerar strings de forma infinita
    // Stream.generate(() -> "a").forEach(print);
    // Stream.iterate(0, n -> n + 1).forEach(println);
  }
}
