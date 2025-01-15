import java.util.HashMap;
import java.util.Map;

public class Mapa {
  public static void main(String[] args) {
    
    Map<Integer, String> usuarios = new HashMap<>();

    // put -> adiciona e caso já possua, ele substitui
    usuarios.put(1, "Roberto");
    usuarios.put(2, "Ricardo");

    System.out.println(usuarios.size());
    System.out.println(usuarios.isEmpty());
    System.out.println(usuarios.keySet());
  }
}
