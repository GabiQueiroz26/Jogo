import java.util.ArrayList;

public class Jogador {

  private ArrayList<Cartas> Jogador = new ArrayList<Cartas>();
  private int pontos = 0;

  
  public Jogador() {
  }

  
  public Jogador(ArrayList<Cartas> Jogador, int pontos) {
    this.Jogador = Jogador;
    this.pontos = pontos;
  }


  protected ArrayList<Cartas> pegarCarta (ArrayList<Cartas> baralho){
    Jogador.add(baralho.get(0));
    baralho.remove(0);
    return Jogador;
  }

  protected int somaCartas(ArrayList<Cartas> cartasJogador) {
    pontos = 0;
    for(int i = 0; i < cartasJogador.size(); i++) {
      pontos += cartasJogador.get(i).numero;
    }
    return pontos;
  }


  public ArrayList<Cartas> getJogador() {
    return Jogador;
  }


  public void setJogador(ArrayList<Cartas> Jogador) {
    this.Jogador = Jogador;
  }


  public int getPontos() {
    return pontos;
  }


  public void setPontos(int pontos) {
    this.pontos = pontos;
  }

  

  


  

  

}
