public class Cartas {
  protected Naipe naipe;
  protected int numero;
  

  public Cartas( Naipe naipe, int numero) {
    this.naipe = naipe;
    this.numero = numero;

  }


  public Naipe getNaipe() {
    return naipe;
  }


  public void setNaipe(Naipe naipe) {
    this.naipe = naipe;
  }


  public int getNumero() {
    return numero;
  }


  public void setNumero(int numero) {
    this.numero = numero;
  }




}
