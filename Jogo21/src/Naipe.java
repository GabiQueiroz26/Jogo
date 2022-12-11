/* O enum foi usado para declarar um conjunto de valores constantes pré definidos */

public enum Naipe {
  paus("paus"), 
  copas("copas"), 
  espadas("Espadas"), 
  ouros("ouros");

  private final String naipe;

  private Naipe(String naipe) {
    this.naipe = naipe;
  }

  public String getNaipe() {
    return naipe;
  }

}