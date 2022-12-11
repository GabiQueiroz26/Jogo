import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

  private ArrayList<Cartas> cartas = new ArrayList<Cartas>() ;

  public Baralho() {

  }

  public ArrayList<Cartas> criaBaralho(boolean embaralhar) {

    for(int n = 0; n < 4; n++){
      for(int num = 1; num <= 13; num++){
        Cartas carta = new Cartas(Naipe.values()[n], num);
        cartas.add(carta);
        if(embaralhar = true){
          Collections.shuffle(cartas);
        }
      }
  }
    return cartas; 

}



}


