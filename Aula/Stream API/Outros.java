import java.util.Arrays;
import java.util.List;

import teste.Aluno01;

public class Outros {
 public static void main(String[] args) {
    
    Aluno01 a1 = new Aluno01("Anna", 7.1);
    Aluno01 a2 = new Aluno01("Luna", 8.1);
    Aluno01 a3 = new Aluno01("Kate", 8.1);
    Aluno01 a4 = new Aluno01("Marcos", 10);
    Aluno01 a5 = new Aluno01("Anna", 7.1);
    Aluno01 a6 = new Aluno01("Pedro", 8.1);
    Aluno01 a7 = new Aluno01("Maria", 8.1);
    Aluno01 a8 = new Aluno01("Olivia", 10);

    List<Aluno01> alunos = 
      Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8); 
  
    System.out.println("distinct...");
    // tire toda a duplicação que tiver
    alunos.stream().distinct().forEach(System.out::println);

    System.out.println("\nSkip/Limit");
    alunos.stream()
    .distinct()
    .skip(2) // pula os dois primeiros 
    .limit(2) // só vai mostrar dois 
    .forEach(System.out::println);


    System.out.println("\nStakeWhile");
    alunos.stream()
    .distinct()
    .takeWhile(a -> a.nota >= 7)
    .forEach(System.out::println);
  

  }
}