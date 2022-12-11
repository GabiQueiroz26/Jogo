import java.util.ArrayList;

public class Pessoa extends Jogador{
  protected int atualizaPontos(ArrayList<Cartas> cartasJogador) {
    setPontos(somaCartas(cartasJogador));
    return getPontos();
  }

  protected ArrayList<Cartas> exibeCartasJogador(){
    return getJogador();
  }
}
