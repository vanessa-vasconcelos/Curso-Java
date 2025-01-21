import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import teste.Aluno01;

public class MinEMax {
  public static void main(String[] args) {
    
    Aluno01 a1 = new Aluno01("Anna", 7.1);
    Aluno01 a2 = new Aluno01("Luna", 8.1);
    Aluno01 a3 = new Aluno01("Kate", 6.1);
    Aluno01 a4 = new Aluno01("Marcos", 10);

    List<Aluno01> alunos = Arrays.asList(a1, a2, a3, a4);

    Comparator<Aluno01> melhorNota = (aluno1, aluno2) -> {
      if(aluno1.nota > aluno2.nota) return 1;
      if(aluno1.nota < aluno2.nota) return -1;
      return 0;
    };

    Comparator<Aluno01> piorNota = (aluno1, aluno2) -> {
      if(aluno1.nota > aluno2.nota) return -1;
      if(aluno1.nota < aluno2.nota) return 1;
      return 0;
    };

    System.out.println(alunos.stream().max(melhorNota).get());
    System.out.println(alunos.stream().max(piorNota).get());
    
    System.out.println(alunos.stream().min(melhorNota).get());
    System.out.println(alunos.stream().max(piorNota).get());
  }
}
