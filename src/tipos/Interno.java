package tipos;
public class Interno {

  private String nombre = "";
  private Regimen regimen = null;
  private int numeroInterno = 0;

  public Interno(String nombre, Regimen regimen, int numeroInterno) {
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
  
  public Regimen getRegimen() {
    return regimen;
  }
  
  public void setRegimen(Regimen regimen) {
    this.regimen = regimen;
  }

  public int getNumeroInterno() {
    return this.numeroInterno;
  }

  public void setNumeroInterno(int numeroInterno) {
    this.numeroInterno = numeroInterno;
  }

  //Esto es la expresion de un interno como cadena, o sea como tipo String
  public String toString(){

    return "nombre: \t"+nombre+"\n" + "numero: \t"+numeroInterno+"\n" + "régimen: \t"+ regimen +"\n";
  }

  //Criterio de igualdad,que ca a seguir java para con nuestros internos
  public boolean equals(Object obj){
    boolean resultado = false;

    //o es un Objeto, que no se que tipo tiene
    //le estoy preguntando si es de tipo interno
    if(!(obj instanceof Interno)){
      resultado = false; //esto directamente acaba la funcion
                    //y me devuelve un false;
    }
    
    //si llego aqui significa que si lo es
    Interno auxiliar = ((Interno) obj);
    if (auxiliar.getNombre().equals(this.nombre)){ 
      if(auxiliar.getNumeroInterno() == this.numeroInterno){
        resultado = true;
      }
    }

    return resultado;
  }


  //Criterio de orden natural, y esto es lo que mira java a la hora de ordenar nuestros internos
  //esto nos devuelve -1, si el interno con el que comparamos va delante nuestra,
  //nos devuelve 0 si el orden es el mismo o da igual
  //nos devuelve 1 si el interno va detras nuestra
  //entonces te lo ordeno por numero de preso, pero tu te buscas vida
  public int compareTo(Interno internoAComparar){
    int resultado=0;

    if(internoAComparar.getNumeroInterno() < this.numeroInterno){
      resultado=-1; 
    }
    if(internoAComparar.getNumeroInterno() == this.numeroInterno){
      resultado=0;
    }

    if(internoAComparar.getNumeroInterno() > this.numeroInterno){
      resultado=1;
    }

    return resultado;    
  }

}
