package Aula.OO.heranca.teste;

import Aula.OO.heranca.Desafio.Carro;
import Aula.OO.heranca.Desafio.Civic;
import Aula.OO.heranca.Desafio.Ferrari;

public class CarroTeste {
  public static void main(String[] args) {
    
    Carro veiculo1 = new Civic();

    Ferrari veiculo2 = new Ferrari(400);

    veiculo2.ligarTurbo();
  
    
    veiculo1.acelerar();
    System.out.println(veiculo1);

    veiculo2.acelerar();
    
    System.out.println(veiculo2.velocidadeDoAr());

    veiculo1.acelerar();
    System.out.println(veiculo1);
 
    veiculo1.frear();
    System.out.println(veiculo1);

    veiculo2.frear();

    System.out.println(veiculo1);
    System.out.println(veiculo2);
    
  }
}
