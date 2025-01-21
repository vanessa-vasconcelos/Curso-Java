package personalizadoA;

import teste.Aluno01;

public class Valida {
  
  private Valida(){}

  public static void aluno(Aluno01 aluno){
    if (aluno == null) {
      throw new IllegalArgumentException("O aluno esá nulo");
    }

    if(aluno.nome == null || aluno.nome.trim().isEmpty()){
      throw new NumeroVazioException("nome");
    }

    if(aluno.nota < 0 || aluno.nota > 10){
      throw new NumeroForaIntervaloException("nota");
    }

  }
}
