
import java.util.*;

public class Prision {

  /*
   * ¡¡¡¡¡PREGUNTA!!!!! -> Para buscar a un preso por qué atributo debería
   * buscarlo? o es indiferente?
   */

  /*
   * Se deben crear tres clases,
   * una llamada Interno, otra Prisión y una Main de prueba. Dependiendo de la
   * forma que uses para ordenar, puede que haga falta otra clase más.
   * 
   * Los Internos están caracterizados por: Nombre, régimen (Un string. Pueden
   * ser: baja peligrosidad,
   * preventivo y máxima seguridad) y el número de interno.
   * 
   * Nuestra clase Prisión se caracteriza por una lista de internos.
   * 
   * En ella, se debe poder hacer lo siguiente:
   * 
   * - Añadir un nuevo interno (meter preso).
   * 
   * - Borrar un interno de la lista buscando antes al mismo (sale libre).
   * 
   * - Imprimir todos los datos de todos los internos de la lista.
   * 
   * - Buscar un interno por nombre.
   * 
   * - Modificar el régimen de un preso buscando antes al mismo, por ejemplo,
   * puede pasar de preventivo a máxima seguridad.
   * 
   * - Ordenar la lista régimen.
   * 
   * Se puede usar, si se quiere, un método que cargue la lista con varios
   * internos de prueba.
   *
   * Crear un menú en la clase principal donde se pueda comprobar toda la
   * funcionalidad del programa.*** (con un menu me refiero a que imprimas algunos
   * mensajes user friendly para verlo y probarlo bien)
   * 
   */

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
      if (nombre == internoAux.nombre) {
        interno = internoAux;

      }

    }

    return interno;
  }

  public Interno modificaRegimenInterno(String nombre, String regimen) {

    Interno interno = buscaInterno(nombre);
    interno.setRegimen(regimen);

    return interno;

  }

  public void imprimeInterno() {

    for (Interno interno : listaInternos) {

      System.out.println(interno);

    }

  }

}
