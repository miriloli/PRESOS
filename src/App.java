
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
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
         * Meter el número de preso de manera automatica
         * 
         */

        Interno interno = new Interno();
        FuncionalidadPrision prision = new FuncionalidadPrision();
        prision.internosPorDefecto();
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println(
                    " 1.Añadir interno\n 2.Borrar interno\n 3.Buscar interno\n 4.Modificar interno\n 5.Imprimir lista de internos");
            String option = sc.nextLine();
            int numeroInterno = 1;
            int option2 = Integer.parseInt(option);

            switch (option2) {

                case 1:
                    System.out.println("Introduzca el nombre del interno a continuación:  ");
                    String nombre = sc.nextLine();
                    interno.setNombre(nombre);
                    System.out.println(
                            "Introduzca el régimen del interno a continuación (Preventivo, baja peligrosidad o máxima seguridad):  ");
                    String regimenInicial = sc.nextLine();
                    Regimen regimen = Utils.parseRegimen(regimenInicial);
                    interno.setRegimen(regimen);
                    interno.setNumeroInterno(numeroInterno);
                    numeroInterno++;
                    prision.anadeInterno(interno);

                    break;
                case 2:
                    System.out.println("Introduzca un nombre de interno: ");
                    Interno internoEncontrado = prision.buscaInterno(sc.nextLine());
                    prision.eliminaInterno(internoEncontrado);

                    break;

                case 3:
                    System.out.println("Introduzca el nombre del interno a buscar: ");
                    Interno internoEncontrado2 = prision.buscaInterno(sc.nextLine());
                    System.out.println(internoEncontrado2);/* Como muestro el interno que me ha encontrado? */
                    break;
                case 4:
                    Regimen regimen2 = null;
                    System.out.println("Introduzca el nombre del interno cuyo regimen desea modificar: ");
                    /* Interno internoEncontrado3= prision.buscaInterno(sc.nextLine()); */
                    prision.modificaRegimenInterno(sc.nextLine(), regimen2); /*
                                                                              * No se como pasar aqui un interno
                                                                              * (interno entero que me devuelve la
                                                                              * búsqueda) a String (nombre del interno
                                                                              * que ha buscado y que pide como parámetro
                                                                              * en el método modificar)
                                                                              */
                    break;
                /* Por qué salta otra vez el inicio del programa? */
                case 5:
                    prision.imprimeInterno();
                    break;

            }
            
        }
        
    }
}
