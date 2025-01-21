package personalizadoA;

import teste.Aluno01;

public class TesteValidacao {
  public static void main(String[] args) {
    try {
      Aluno01 aluno = new Aluno01("Ana", 7);
      Valida.aluno(aluno); 

      Valida.aluno(null);
    } catch (NumeroVazioException | 
        NumeroForaIntervaloException | 
        IllegalArgumentException e) {

      System.out.println(e.getMessage());
    }

    System.out.println("Fim");
  }
}
