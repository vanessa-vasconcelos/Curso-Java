import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    BinaryOperator<Integer> soma = (ac, n) -> ac + n;

    // Em reduce, quando não se passa o valor inicial, 
    //é preciso chamar o get
    Integer total1 = nums.stream().reduce(soma).get();
    System.out.println(total1);

    // Em reduce, quando se passa o valor inicial, 
    // não precisa passar get, pois o valor total vai
    // ser do mesmo tipo do valor passado inicialmente
    Integer total2 = nums.stream().reduce(100, soma);
    System.out.println(total2);

    nums.stream()
      .filter(n -> n > 5)
      .reduce(soma)
      .ifPresent(System.out::println);    

  }
}
