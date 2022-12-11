import java.util.ArrayList;

public class Computador extends Jogador {
  

  protected Boolean pararJogo(int pontos){
    if(pontos < 19) {
      return true;
    } else {
      return false;
    }
  }

  protected Boolean atualizar(ArrayList<Cartas> cartasJogador){
    setPontos(somaCartas(cartasJogador));
    return pararJogo(getPontos());
  }

  protected ArrayList<Cartas> exibeCartasJogador() {
    return getJogador();
  }
 
}
