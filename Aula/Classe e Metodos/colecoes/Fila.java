import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    Queue<String> fila = new LinkedList<>();

  // Ambos iram adicionar um elemento na fila
  // .add() -> lançará uma exceção caso a fila esteja cheia
    fila.add("Anna");
  // .offer() -> retorna falso caso a fila esteja cheia
    fila.offer("Bia");
    fila.add("Carlos");
    fila.offer("Daniel");
    fila.add("Rafaela");

    // peek e element-> lê o primeiro elemento da fila, mas não remove
    // peek -> Quando a fila está vazia ele retorna nulo 
    // element -> Quando a fila está vazia ele retorna uma exceção
    System.out.println(fila.peek());
    System.out.println(fila.element());

    //fila.isEmpty() -> para saber se a fila está vazia ou não

    // Mostra o primeiro elemento da fila e remove esse elemento
    System.out.println(fila.poll());
    System.out.println(fila.poll());
  }
}
