package teste;

public class Causa {
  public static void main(String[] args) {
    
    try {
      metodoA(null);
    } catch (IllegalArgumentException e) {
      if(e.getCause() != null) {
        System.out.println(e.getCause().getMessage());
      }
    }
  }

  static void metodoA(Aluno01 aluno){
    try{
    metodoB(aluno);
  } catch (Exception causa){
    throw new IllegalArgumentException(causa);
    }
  }
  static void metodoB(Aluno01 aluno){
    if(aluno == null){
      throw new NullPointerException("Aluno está NULLOOO!");
    }

    System.out.println(aluno.nome);
  }
}
