public class Interno {
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
   * puede pasar de
   * preventivo a máxima seguridad.
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

  String nombre = "";
  String regimen = "";
  int numeroInterno = 0;

  public Interno(String nombre, String regimen, int numeroInterno) {
    this.nombre = nombre;
    this.regimen = regimen;
    this.numeroInterno = numeroInterno;
  }

  public Interno() {
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRegimen() {
    return this.regimen;
  }

  public void setRegimen(String regimen) {
    this.regimen = regimen;
  }

  public int getNumeroInterno() {
    return this.numeroInterno;
  }

  public void setNumeroInterno(int numeroInterno) {
    this.numeroInterno = numeroInterno;
  }

}
