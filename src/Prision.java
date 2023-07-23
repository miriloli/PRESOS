
import java.util.*;

public class Prision {


  List<Interno> listaInternos = new ArrayList<Interno>();

  public Interno anadeInterno(Interno interno) {

    listaInternos.add(interno);

    return interno;
  }

  public Interno eliminaInterno(Interno interno) {

    listaInternos.remove(interno);

    return interno;
  }

  public Interno buscaInterno(String nombre) {

    Interno interno = new Interno();

    for (Interno internoAux : listaInternos) {
      if (nombre.equals(internoAux.getNombre())) {
        interno = internoAux;

      }

    }

    return interno;
  }

  public Interno modificaRegimenInterno(String nombre, Regimen regimen) {

    Interno interno = buscaInterno(nombre);
    interno.setRegimen(regimen);

    return interno;

  }

  public void imprimeInterno() {

    for (Interno interno : listaInternos) {

      System.out.println(interno);

    }

  }

  public void internosPorDefecto() {

    Interno interno = new Interno("Pepe", Regimen.BAJA_PELIGROSIDAD, 001);
    Interno interno2 = new Interno("Roberto", Regimen.PREVENTIVO, 002);
    Interno interno3 = new Interno("susmuertos",Regimen.MAXIMA_SEGURIDAD,003);
    Interno interno4 = new Interno("pppppp", Regimen.MAXIMA_SEGURIDAD, 004);
    Interno interno5 = new Interno("Carlos",  Regimen.PREVENTIVO, 005);

    anadeInterno(interno);
    anadeInterno(interno2);
    anadeInterno(interno3);
    anadeInterno(interno4);
    anadeInterno(interno5);

  }

}
