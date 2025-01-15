package personalizadoB;

public class NumeroVazioException extends Exception{
  
  private String nomeDoAtributo;

  public NumeroVazioException(String nomeDoAtributo){
    this.nomeDoAtributo = nomeDoAtributo;
  }

  public String getMessage(){
    return String.format("O atributo '%s' está vazio", nomeDoAtributo);
  }
}
