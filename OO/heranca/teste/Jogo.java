package OO.heranca.teste;

import OO.heranca.Direcao;
import OO.heranca.Heroi;
import OO.heranca.Mostro;

public class Jogo {
  public static void main(String[] args) {
    
    Mostro mostro = new Mostro();
    mostro.x = 10;
    mostro.y = 10;

    Heroi heroi = new Heroi(10, 11);

    System.out.println("Monstro tem " + mostro.vida);
    System.out.println("Monstro tem " + heroi.vida);

    mostro.atacar(heroi);
    heroi.atacar(mostro);

    mostro.andar(Direcao.NORTE);
    mostro.atacar(heroi);
    heroi.atacar(mostro);

    mostro.atacar(heroi);
    heroi.atacar(mostro);

    System.out.println("Monstro tem " + mostro.vida);
    System.out.println("Monstro tem " + heroi.vida);
  }
}
