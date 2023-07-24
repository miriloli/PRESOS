
import java.util.*;

import tipos.Interno;
import tipos.Prision;
import tipos.Regimen;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //todo esto son variables a nivel 
        //de clase reutilizable por el programador
        Interno interno = new Interno();
        Prision prision = new Prision();
        prision.internosPorDefecto();
        int numeroInterno = 1;

        //esto para controlar las opciones del menu
        int option = 0;

        do{
            //esto es el Syso que imprime el menu
            //lo he sacado fuera para guarrear menos
            //ctrl + click en, para ir a la definicion de la funcion
            mostrarMenu();

            String userOPtion = sc.nextLine();
            option = Integer.parseInt(userOPtion);

            switch (option) {

                case 1:
                    System.out.println("Va usted a añadir un preso, a continuación se le pedirán diferentes datos");
                    
                    //Manejamos el nombre
                    System.out.println("Introduzca el nombre del interno a continuación:  ");
                    String nombre = sc.nextLine();
                    interno.setNombre(nombre);

                    //Manejamos el regimen
                    System.out.println("Introduzca el régimen del interno a continuación (Preventivo, baja peligrosidad o máxima seguridad):  ");
                    String regimenInicial = sc.nextLine();
                    Regimen regimen = Utils.parseRegimen(regimenInicial);
                    interno.setRegimen(regimen);

                    //manejamos el numero
                    interno.setNumeroInterno(numeroInterno);
                    numeroInterno++;

                    //cuando ya lo tenemos todo añadimos
                    prision.anadeInterno(interno);
                    break;

                case 2:
                    System.out.println("Va usted a eliminar un preso");
                    
                    //preguntamos y borramos, no necesitamos variables nuevas
                    //podemos usar la de antes por que solo vamos a ejecutar
                    //un caso a la vez.
                    System.out.println("Introduzca el nombre del interno a eliminar: ");
                    interno = prision.buscaInterno(sc.nextLine());
                    prision.eliminaInterno(interno);
                    break;

                case 3:
                    //aqui lo mismos, solo estamos en este caso
                    //podemos usar la variable que hemos declarado
                    //arriba del todo una vez.
                    System.out.println("Introduzca el nombre del interno a buscar: ");
                    interno = prision.buscaInterno(sc.nextLine());
                    System.out.println(interno);
                    break;

                case 4:
                    //manejamos para pedir el nombre, y de nuevo
                    //utilizamos la variable qe tenemos a nivel de clase
                    System.out.println("Introduzca el nombre del interno cuyo regimen desea modificar: ");
                    interno= prision.buscaInterno(sc.nextLine());
                    
                    //manejamos regimen
                    regimen = null;
                    System.out.println("Ahora Introduzca el nuevo Regimen del interno: ");
                    regimen = Utils.parseRegimen(sc.nextLine());

                    //finalmente modificamos
                    prision.modificaRegimenInterno(interno.getNombre(), regimen);
                    break;
                
                case 5:
                    //aqui no deberia de haber preguntas
                    prision.imprimeInterno();
                    break;

                case 0:
                    option = 0;
                    break;
            }
        }while (option != 0);
    
        sc.close();
    }

    static void mostrarMenu() {
        System.out.println(
                    "1. Añadir interno\n"+
                    "2. Borrar interno\n"+
                    "3. Buscar interno\n"+
                    "4. Modificar interno\n"+
                    "5. Imprimir lista de internos\n"+
                    "0. Salir"
        );
    }
}
